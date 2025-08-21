import java.util.ArrayList;
import java.util.Date;

public class Main {
   public static void main(String[] args) {
      // Crear objetos de la clase Date y clonar
      System.out.println("***Usando fechas***");
      Date fecha1 = new Date();
      Date fecha2 = new Date();
      System.out.println(fecha1);
      System.out.println(fecha2);
      System.out.println(fecha1 == fecha2);
      System.out.println(fecha1.equals(fecha2));
      fecha2.setSeconds(10);
      System.out.println(fecha1.equals(fecha2));
      // Clon de fecha
      Date fechaClon = (Date) fecha1.clone();
      System.out.println("***Clonando fechas***");
      System.out.println(fecha1);
      System.out.println(fechaClon);
      System.out.println(fecha1 == fechaClon);
      System.out.println(fecha1.equals(fechaClon));
      fechaClon.setSeconds(fecha1.getSeconds()+1);
      System.out.println(fecha1 == fechaClon);
      System.out.println(fecha1.equals(fechaClon));

      System.out.println("***Clonando listas***");
      // Crear una lista de StringBuilder y clonarla
      ArrayList<StringBuilder> lista1 = new ArrayList<>();
      lista1.add(new StringBuilder("Hola"));
      lista1.add(new StringBuilder("Mundo"));
      System.out.println(lista1);
      ArrayList<StringBuilder> listaClon = (ArrayList<StringBuilder>) lista1.clone();
      System.out.println(listaClon);
      System.out.println(lista1 == listaClon);
      listaClon.remove(1);
      System.out.println(lista1);
      System.out.println(listaClon);
      listaClon.get(0).append("Holita");
      System.out.println(listaClon);
      System.out.println(lista1);
      System.out.println(lista1.get(0) == listaClon.get(0));

      // Crear una clase ObjetoInventario y clonar un objeto
      ObjetoInventarioProfundo obj1 = new ObjetoInventarioProfundo("Pocion curativa media");
      ObjetoInventarioProfundo obj2 = (ObjetoInventarioProfundo) obj1.clone();
      System.out.println(obj1);
      System.out.println(obj2);
      System.out.println(obj1.nombre == obj2.nombre);
      obj2.nombre  = "Pocion de fuerza de gigante de fuego";
      System.out.println(obj1.nombre == obj2.nombre);
      SlotProfundo slot1 = new SlotProfundo(obj1, 5);
      System.out.println(slot1);
      SlotProfundo slotClon = (SlotProfundo) slot1.clone();
      System.out.println(slotClon);
      slotClon.cantidad = 1;
      System.out.println(slot1);
      System.out.println(slotClon);
      slotClon.obj.nombre="Pocion de invisibilidad";
      System.out.println(slot1);
      System.out.println(slotClon);
      System.out.println("***INVENTARIO***");
      Inventario inv1 = new Inventario();
      inv1.lista.add(slot1);
      SlotProfundo slot2 = (SlotProfundo) slot1.clone();
      slot2.obj.nombre = "Anillo +2";
      inv1.lista.add(slot2);
      System.out.println(inv1);
      Inventario invClon = (Inventario) inv1.clone();
      System.out.println(inv1.lista == invClon.lista);
      System.out.println(inv1);
      System.out.println(invClon);
      slot1.obj.nombre = "Flechas";
      System.out.println(inv1);
      System.out.println(invClon);
      invClon.lista.get(1).obj.nombre = "Cota de malla";
      System.out.println(inv1);
      System.out.println(invClon);



   }
}