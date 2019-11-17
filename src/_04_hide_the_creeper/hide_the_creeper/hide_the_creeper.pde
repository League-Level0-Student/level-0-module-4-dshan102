PImage creeper;
int x=45;
int y=900;
void setup() {
  size(1000,1000);
  PImage minecraft = loadImage("minecraft.jpeg");
  minecraft.resize(width, height);
  creeper = loadImage("creeper.png");
  creeper.resize(10, 10);
}

void draw() {
  background(minecraft);
  image(creeper, x, y);
  ellipse(mouseX,mouseY,10,10);
}
