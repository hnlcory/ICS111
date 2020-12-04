class Player extends Colidable implements Entity{//switch to entity
 color c;
 int px,py;
 boolean up=false,down=false,left=false,right=false;
 
 Player(int x, int y, color c){
  //super(x,y); - switch from class to interface
  this.x=x;
  this.y=y;
  this.c=c;
 }
 
  float collision(Colidable other){
    return dist(other.x,other.y,x,y); 
  }
 
 void draw(){
   fill(c);
   ellipse(x,y,20,20); 
  } 
  
  void update(){
    px=x;
    py=y;
    if (up==true){
      y=y-2;
    }
    if (down==true){
      y=y+2;
    }
    if (left==true){
      x=x-2;
    }  
    if (right==true){
      x=x+2;
    }   
  }
  
  void revert(){//reverse movement
    x=px;
    y=py;
  }   
  
  void keyPressed(){//when game ends
    if(GameOn==false){
      up=false;
      down=false;
      left=false;
      right=false;
      revert();
    }
  else{
    if (keyPressed&&key=='w'){
      up=true;
    }
    else if (keyPressed&&key=='s'){
      down=true;
    }
    else if (keyPressed&&key=='a'){
      left=true;
    }  
    else if (keyPressed&&key=='d'){
      right=true;
    }
  }
}

void keyReleased(){
  if (key=='w'){
    up=false;  
  }
  else if (key=='s'){
    down=false;
  }
  else if (key=='a'){
    left=false;
  }  
  else if (key=='d'){
    right=false;
  }
}

  int returnLocationX(){
    return x;
  }

  int returnLocationY(){
    return y;
  }

}
