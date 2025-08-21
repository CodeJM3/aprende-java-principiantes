import java.util.ArrayList;

public class Inventario implements Cloneable{

   public ArrayList<SlotProfundo> lista;

   public Inventario() {
      lista = new ArrayList<>();
   }

   public Object clone() {
      Inventario clon = null;
      try {
         clon = (Inventario) super.clone();
      } catch (CloneNotSupportedException e) {
         throw new RuntimeException(e);
      }

      //clon.lista = new ArrayList<>(lista.size());
      clon.lista = (ArrayList<SlotProfundo>) lista.clone();
      for(int i=0; i<lista.size(); i++) {
         clon.lista.set(i, (SlotProfundo) lista.get(i).clone());
      }

      return clon;
   }

   @Override
   public String toString() {
      return lista + "";
   }
}
