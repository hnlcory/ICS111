class Timer
{
 float Time;
  
 Timer(float set){
   Time = set;
 }
 
 float getTime(){//time
    return Time;
 }
 
  void setTime(float set){//set time
   Time = set; 
  }
  
  void countUp(){
   Time +=  1/frameRate; 
  }
  
}
