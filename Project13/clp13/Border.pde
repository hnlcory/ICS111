class Border extends Colidable{
  int x1,y1,x2,y2,x3,y3;
  Border(int x1,int y1, int x2,int y2, int x3, int y3){
    this.x1=x1;
    this.y1=y1;
    this.x2=x2;
    this.y2=y2;
    this.x3=x3;
    this.y3=y3;
  }
  void draw(){
   fill(0);
   triangle(x1,y1,x2,y2,x3,y3);
  }
  float collision(Colidable other){
    float distance=dist(other.x,other.y,x+width/2,y+height/2);
    if (distance<max(width,height)){//if close enough to be inside of eachother
      return min(
          min(
          abs(other.x-x),//measure of other to top left
          abs(other.x-(x+width))),//right
          min(
          abs(other.y-(y)),//top
          abs(other.y-(y+height))));//bottom
    }
    return distance-max(width,height)/2;
  }
}
