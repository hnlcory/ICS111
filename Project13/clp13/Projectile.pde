class Projectile extends Colidable implements Entity{
  color c;
  int x,y;
  int xspeed = int(random(8));  // Speed of the ball -random 
  int yspeed = int(random(8));  // Speed of the ball -random
  int xdirection = int(random(1,3));  // Left/Right -random
  int ydirection = int(random(1,3));  // Top/Bottom -tandom
  //int ranSpot;
  
  int placex,placey;
  
  Projectile(){ 
  }
  
  void draw(){
     ranSpot = int(random(0,5));
    //println(ranSpot);
    
    if (ranSpot==1){
    placex=10;placey=490; 
    }
    else if (ranSpot==2){
     placex=10;placey=10; 
    }
    else if (ranSpot==3){
     placex=490;placey=10; 
    }
    else if (ranSpot==4){
     placex=490;placey=490; 
    }
  fill(random(255),random(255),random(255));
  ellipse(x,y,8,8); //change here   
  }
  
  void update(){//update for walls/player
  x = x + ( xspeed * xdirection );//possibly remove direction
  y = y + ( yspeed * ydirection ); 
  
  
  if (x> width || x<0) {//wall bounce
   xspeed = xspeed * -1; 
  }
  if(y> height || y<0){//wall bounce
   yspeed = yspeed * -1; 
  }
  
  if (this.collision(p1)<14){
    GameOn = false; //end game 
   }  
  } 
  
int returnLocationX(){
  return x;
}

int returnLocationY(){
  return y;
} 
  
float collision(Colidable other){
  return dist(other.x,other.y,x,y); 
}
  
}
