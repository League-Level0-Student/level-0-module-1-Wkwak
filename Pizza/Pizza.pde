void setup(){
  size(500,500);
  fill(222,184,135);
  ellipse(width/2,height/2,width,height);
  fill(220,20,60);
  ellipse(width/2,height/2,400,400);
  fill(255,255,153);
  ellipse(width/2,height/2,300,300);
}

void draw(){
  PImage curly = loadImage("curly.gif");
    curly.resize(20, 20);
  image(curly, width/2, height/2);
  image (curly, 200,200);
  image (curly, 280, 200);
  if (mousePressed){
    image (curly, mouseX, mouseY);
  }
}