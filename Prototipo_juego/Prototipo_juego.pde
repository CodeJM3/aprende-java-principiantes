int ancho = 500;
int alto = 500;

Coco coco;
Coche coche;

void settings() {
  size(ancho,alto);
}

void setup() {
  coco = new Coco(-100, -100);
  coche = new Coche(0, height-1, 1);
}

void draw() {
  background(255);
  coco.mostrar();
  coche.mostrar();
}

void mousePressed() {
  coco = new Coco(mouseX, mouseY);
}
