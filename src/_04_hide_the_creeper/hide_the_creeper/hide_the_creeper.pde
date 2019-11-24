PImage creeper;
PImage minecraft;
int x=45;
int y=900;
void setup() {
  size(1000,1000);
  minecraft = loadImage("minecraft.jpeg");
  minecraft.resize(width, height);
  creeper = loadImage("creeper.png");
  creeper.resize(10, 10);
}

void draw() {
  background(minecraft);
  image(creeper, x, y);
  if (isNear(mouseX,x) == true && isNear(mouseY, y)) {
    fill(36,116,29);
    print("You found the creeper");
  }
  else {
    fill(255,0,0);
  }
  ellipse(mouseX,mouseY,10,10);
}

boolean isNear(int a, int b) {
  if (abs(a-b)<10)
      return true;
  else 
      return false;
}
