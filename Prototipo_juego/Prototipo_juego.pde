int ancho = 500;
int alto = 500;

int puntuacion = 0;
Coco coco;
Coche coche;

void settings() {
  size(ancho,alto);
}

void setup() {
  textSize(30);
  coco = new Coco(-100, -100, 20);
  coche = new Coche(0, (height-1)-50/2, 1, 100, 50);
}

void draw() {
  background(255);
  coco.mostrar();
  coche.mostrar();
  detectarColisiones();
  fill(0);
  text("Puntuación: " + puntuacion, 0, 30);
}

void mousePressed() {
  coco = new Coco(mouseX, mouseY, 20);
}

void detectarColisiones() {
  float distancia = dist(coco.xPos, coco.yPos, coche.xPos, coche.yPos);
  float sumaRadios = coco.diametro/2 + coche.altura/2;
  if(sumaRadios > distancia) {
    puntuacion++;
    coco.xPos = -100;
    coco.yPos = -100;
  }
}
