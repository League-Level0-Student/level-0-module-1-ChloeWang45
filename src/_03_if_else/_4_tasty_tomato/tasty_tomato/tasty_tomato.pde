void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#FF0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#2EA52D);
    rect(176, 103, 12, 32);
    if(mousePressed == true){
    fill(200, 200, 200);
    ellipse(285, 200, 30, 30);
    }
}
