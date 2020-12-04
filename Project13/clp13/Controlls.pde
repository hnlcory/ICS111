//Cory Parker Section 5
Timer t1;
Player p1;
Border e;
Projectile p;
int ranSpot;
ArrayList<Projectile> mainList;//main projectile group
Boolean GameOn = true;
long lastTime = 0;

void setup(){//done once
  size(500,500);
  textSize(15);
  int prx = int(random(25,470)),pry = int(random(25,470));//random player spawn location, avoids being in border
  p1= new Player(prx,pry,color(320,0,0));
  e=new Border(20,20,60,20,40,60);
  t1 = new Timer(0);//timer start at 0
  lastTime = millis();
  mainList = new ArrayList<Projectile>(); 
  
  for (int j=0; j < 1; j++){//creates initial projectile
  Projectile newProj = new Projectile();
  mainList.add(newProj); 
  }
 
}
 
void draw(){//constant
  e.draw();//functions as game border
  background(80,80,80); 
  t1.countUp();//score time
  fill(0);
  text("Time: "+t1.getTime()+" seconds",20,20);//score time in window
  p1.draw();
  fill(0);
  p1.update();
  
 if (e.collision(p1)<10){// player - border collision
    p1.revert();
  }

  for (Projectile p : mainList){ //projectile loop
   
    p.draw();
    p.update();
  }
  
  if (millis() - lastTime > random(2000,5000) ) {//random time delay of projectiles
    lastTime = millis();
    Projectile p2 = new Projectile();
    mainList.add(p2);
   
  }
  

 // println(p.collision(p1));//prints collision of projectile
  if (GameOn==false){//player - projectile collison, game ending
    background(75,75,75);
    text("You Survived For "+t1.getTime()+" seconds",125,200);
    stop();
  }  
}

void keyPressed(){//player movement
  p1.keyPressed();
}

void keyReleased(){//player movement
  p1.keyReleased();
}
