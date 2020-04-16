size(500,500);
for(int circles=8; circles>=1;circles--){
if(circles%2==1){
  fill(255,0,0);
}
  else{
    fill(0,0,0);
  }
  ellipse(250,250,50*circles,50*circles);
  


}
