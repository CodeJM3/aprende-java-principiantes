import java.io.File;

public class Main {


   public static int factorial(int n) {
      if (n == 0) { // Caso base
         return 1;
      }
      else {
         return n * factorial(n - 1); // Llamada recursiva
      }
   }

   public static void main(String[] args) {
      System.out.println("*****RECURSIVIDAD*****");
      System.out.println();
      System.out.println(fibonacci(6));
      System.out.println();
      System.out.println(sum(5));
      System.out.println();
      piramideInv(3);
      System.out.println();
      piramide(5, 1);
      System.out.println();
      // Cambia esto por una carpeta que exista o lanzara una excepcion
      File ruta = new File("/Users/admin/Desktop/Recursion");
      listarFicheros(ruta);
      System.out.println();
      listarFicherosTab(ruta, "");
   }

   /*
      Ejercicio 1: secuencia de Fibonacci. Crear un metodo recursivo
      que reciba un entero n>=0 y devuelva el término correspondiente
      de la sucesión de Fibonacci. Dicha sucesión se define así:

      F(0)=0
      F(1)=1
      F(n)=F(n−1)+F(n−2), para n≥2

      Lo que da los siguientes términos:
      0,1,1,2,3,5,8,13,21,34,55,…
   */
   public static int fibonacci(int n) {
      if (n <= 1) {
         return n;
      } else {
         return fibonacci(n - 1) + fibonacci(n - 2);
      }
   }

   /*
      Ejercicio 2: crear un metodo recursivo para generar la suma de
      los n primeros números naturales, para n>=0. Por ejemplo:
      - si n=5 la suma que hay que generar es: 1+2+3+4+5=15
      - si n=3 la suma que hay que generar es: 1+2+3=6
      - si n=1 la suma que hay que generar es: 1
      - si n=0 la suma que hay que generar es: 0
    */
   public static int sum(int cantidad) {
      if (cantidad > 0) {
         return cantidad + sum(cantidad - 1);
      } else {
         return 0;
      }
   }

   /*
      Ejercicio 3: crear un metodo recursivo que reciba un entero
      n>=1 y que imprima una pirámide invertida con *. Por ejemplo:
      - si se recibe n=5 se imprime
      *****
      ****
      ***
      **
      *
      - si se recibe n=3 se imprime
      ***
      **
      *
      - si se recibe n=1 se imprime
      *
    */
   public static void piramideInv(int n) {
      if(n == 1) {
         System.out.println("*");
         return;
      }

      for(int i=0; i<n; i++) {
         System.out.print("*");
      }
      System.out.println();
      piramideInv(n-1);
   }

   /*
      Ejercicio 3: crear un metodo recursivo que reciba un entero
      n>=1 y que imprima una pirámide con *. Por ejemplo:
      - si se recibe n=5 se imprime
      *
      **
      ***
      ****
      *****
      - si se recibe n=3 se imprime
      *
      **
      ***
      - si se recibe n=1 se imprime
      *
    */
   public static void piramide(int n, int actual) {
      if(n < actual) {
         return;
      }

      for(int i=0; i<actual; i++) {
         System.out.print("*");
      }
      System.out.println();
      piramide(n, actual+1);
   }

   /*
      Crear un metodo recursivo que reciba una ruta representada
      por un File y muestre sus contenidos, incluyendo también
      los de todas las subcarpetas.
    */
   public static void listarFicheros(File dir) {
      for (File file : dir.listFiles()) {
         if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath());
            listarFicheros(file);  // Recursión con subcarpeta
         } else {
            System.out.println(file.getAbsolutePath());
         }
      }
   }

   /*
      Repetir el ejercicio anterior pero añadiendo tabulaciones
      que marquen los niveles dentro de la jerarquía de archivos.
    */
   public static void listarFicherosTab(File dir, String tabs) {
      for (File file : dir.listFiles()) {
         if (file.isDirectory()) {
            System.out.println(tabs + file.getAbsolutePath());
            listarFicherosTab(file, tabs + "\t");  // Recursión con subcarpeta
         } else {
            System.out.println(tabs + file.getAbsolutePath());
         }
      }
   }


}