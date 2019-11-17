PImage donkey;
PImage tail;
int x;
int y;
boolean click = false;
void setup() {
  donkey = loadImage("Donkey.jpg");
  tail = loadImage("donkey-tail.png");
  size(800,590);
}

void draw() {
  if (mousePressed) {
    click=true;
    x=mouseX;
    y=mouseY;
  }
  if (dist(0,0,mouseX,mouseY)<30) {
      background (donkey);
  }
  else {
    background(48,56,183);
  }
  if (click == true) {
    background (donkey);
      image(tail, x, y, 100, 150);
  }
  else {
  image(tail, mouseX, mouseY, 100, 150);
  }
  rect(0,0,30,30);
  
}
