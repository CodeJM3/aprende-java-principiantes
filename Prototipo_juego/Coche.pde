public class Coche {
  
  public float xPos, yPos;
  private float xVel;
  private float anchura;
  public float altura;
  private color c;
  
  public Coche(float xPos, float yPos, float xVel, float anchura, float altura) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.xVel = xVel;
    this.anchura = anchura;
    this.altura = altura;
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
    rect(xPos, yPos, anchura, altura);
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
