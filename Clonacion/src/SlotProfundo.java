public class SlotProfundo  implements Cloneable{

   public ObjetoInventarioProfundo obj;

   public int cantidad;

   public SlotProfundo(ObjetoInventarioProfundo obj, int cantidad) {
      this.obj = obj;
      this.cantidad = cantidad;
   }

   public ObjetoInventarioProfundo getObj() {
      return obj;
   }

   public void setObj(ObjetoInventarioProfundo obj) {
      this.obj = obj;
   }

   public int getCantidad() {
      return cantidad;
   }

   public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
   }

   public Object clone() {
      SlotProfundo clon = null;
      try {
         clon = (SlotProfundo) super.clone();
      } catch (CloneNotSupportedException e) {
         throw new RuntimeException(e);
      }

      clon.obj = (ObjetoInventarioProfundo) clon.obj.clone();

      return clon;
   }

   @Override
   public String toString() {
      return "Slot{" +
              "obj=" + obj +
              ", cantidad=" + cantidad +
              '}';
   }

}
