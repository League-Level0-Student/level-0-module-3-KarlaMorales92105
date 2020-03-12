int x = 380;
int y = 143;

void setup()  {
  background(255,255,255); size(800,800);
}

void draw()  {
  fill(255,0,0,100);
 ellipse(x,y,300,300);
  fill(0,255,0,100);
  ellipse(483,317,300,300);
  fill(0,0,255,100);
  ellipse(272,318,300,300);
fill(0,0,0,255);
text("ME",379,265);
fill(0,0,0,255);
text("OLDER SISTER", 241,328);
fill(0,0,0,255);
text("MEXICANA", 363, 106);
fill(0,0,0,255);
text("STUDENT", 504, 326);

  if(mousePressed){
println(mouseX+ "," + mouseY);

  }
}