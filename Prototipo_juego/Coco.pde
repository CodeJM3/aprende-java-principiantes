public class Coco {
  
  public float xPos, yPos;
  public float diametro;
  private color colorCoco;
  private  float gravedad;
  private float yVel;
  
  public Coco(float xPos, float yPos, float diametro) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.diametro = diametro;
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
