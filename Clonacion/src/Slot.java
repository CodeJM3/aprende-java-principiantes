public class Slot implements Cloneable {

   public ObjetoInventario obj;

   public int cantidad;

   public Slot(ObjetoInventario obj, int cantidad) {
      this.obj = obj;
      this.cantidad = cantidad;
   }

   public ObjetoInventario getObj() {
      return obj;
   }

   public void setObj(ObjetoInventario obj) {
      this.obj = obj;
   }

   public int getCantidad() {
      return cantidad;
   }

   public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
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
      return "Slot{" +
              "obj=" + obj +
              ", cantidad=" + cantidad +
              '}';
   }
}
