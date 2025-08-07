public class Coche {
  
  private float xPos;
  private float yPos;
  private float xVel;
  private float anchura;
  private float altura;
  private color c;
  
  public Coche(float xPos, float yPos, float xVel) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.xVel = xVel;
    anchura = 100;
    altura = 50;
    c = color(255, 0, 0);
  }
  
  public void mostrar() {
    conducir();
    pintarCoche();
  }
  
  private void pintarCoche() {
    stroke(0);
    fill(c);
    rectMode(CENTER);
    rect(xPos, yPos-altura/2, anchura, altura);
  }
  
  private void conducir() {
    xPos = (xPos+xVel)%width;
  }
  
  /*
  private void conducir() {
    xPos += xVel;
    if(xPos > width) {
      xPos = 0;
    }
  }
  */
  
}
