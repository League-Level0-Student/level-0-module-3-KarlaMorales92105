void setup() {
noFill();
size( 1000, 500);
}

int x=250;
int speed=1;
int xtwo=750;
int speedtwo= -1;
void draw() {
background(#8EF707);
  
for( int circles=10; circles>=1; circles--) {
  
ellipse(x,250,50*circles,50*circles);
}
x+= speed;

if (x>= width){
  speed= -speed;


}
else if( x<=0) {
  speed= -speed;

}

  
for( int circles= 10; circles>=1; circles--){

ellipse(xtwo,250,50*circles,50*circles);
}

}
