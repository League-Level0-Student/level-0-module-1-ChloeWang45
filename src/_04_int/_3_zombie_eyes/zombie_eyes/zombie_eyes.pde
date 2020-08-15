void setup() {
  PImage face = loadImage("face");
  size(500, 500);
  face.resize(500, 500);
  image(face, 0, 0);
}
void draw() {
  noStroke();
  fill(mouseX, mouseY, 75);
  ellipse(205, 130, 118, 90);
  ellipse(313, 133, 83, 65);
  fill(0, 0, 0);
  ellipse(205, 130, 15, 15);
  ellipse(313, 133, 15, 15);
}
