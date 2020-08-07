
void setup() {
    size(500, 500);
    noStroke();
    fill(#F7C155);
    ellipse(250, 250, 300, 300);
    fill(#F50213);
    ellipse(250, 250, 250, 250);
    fill(#FFDB0A);
    ellipse(250, 250, 235, 235);
    
}
void draw() {
    PImage pepperoni;
    PImage olive;
    PImage mushroom;
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
    pepperoni.resize(40,40);
    if(mousePressed){
      image(pepperoni, 250, 250);
      image(pepperoni, 300, 300);
      image(pepperoni, 175, 150);
      image(pepperoni, 200, 290);
      image(pepperoni, 150, 220);
      image(pepperoni, 270, 175);
    }
    else if(mouseButton == RIGHT){
      olive.resize(15, 15);
      image(olive, 230, 230);
      mushroom.resize(20, 20);
      image(mushroom, 175, 150);
    }
}
