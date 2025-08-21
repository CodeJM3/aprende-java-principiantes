public class ObjetoInventario implements Cloneable{

   public String nombre;

   public ObjetoInventario(String nombre) {
      this.nombre = nombre;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Object clone() {
      Object obj = null;
      try {
         obj = super.clone();
      } catch (CloneNotSupportedException e) {
         throw new RuntimeException(e);
      }

      return obj;
   }

   @Override
   public String toString() {
      return "ObjetoInventario{" +
              "nombre='" + nombre + '\'' +
              '}';
   }
}
