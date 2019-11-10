PImage face;
void setup() {
      face = loadImage("Spongebob.png");
       size(800,600);
    face.resize(width,height);
    
}

void draw() {
  background(face);
  fill(255,255,255);
  ellipse(190, 100, 205, 100);
  fill(0,0,0);
  
  fill(255,255,255);
  ellipse(385, 105, 240, 115);
  fill(0,0,0);
  
  if(mouseX<240) {
    mouseX=240;
  }
   if(mouseY>150) {
    mouseY=150;
  }
  if(mouseX>385) {
    mouseX=385;
  }
  if(mouseY<105) {
    mouseY=105;
  }
  ellipse(mouseX,mouseY, 50,30);
  ellipse(mouseX+195, mouseY+5, 50, 30);
  
  //if(mouseX
}
