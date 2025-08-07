public class Coco {
  
  private float xPos, yPos;
  private float diametro;
  private color colorCoco;
  private float gravedad;
  private float yVel;
  
  public Coco(float xPos, float yPos) {
    this.xPos = xPos;
    this.yPos = yPos;
    diametro = 20;
    colorCoco = color(66, 50, 3);
    gravedad = 1;
    yVel = 0;
  }
  
  public void mostrar() {
    aplicarGravedad();
    pintarCoco();
  }
  
  private void aplicarGravedad() {
    yVel += gravedad;
    yPos += yVel;
    if((yPos-diametro/2)>height) {
      gravedad = 0;
      yVel = 0;
    }
  }
  
  private void pintarCoco() {
    fill(colorCoco);
    ellipse(xPos, yPos, diametro, diametro);
  }
  
}
