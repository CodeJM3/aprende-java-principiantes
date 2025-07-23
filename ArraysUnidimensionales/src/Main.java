import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****ARRAYS UNIDIMENSIONALES*****");
        System.out.println();
        /*
         **1. Crea un array de 5 números enteros con una lista de
         * inicialización y muestra cada uno en una línea por consola.
         */
        System.out.println("***EJERCICIO 1***");
        int[] intArr1 = {4, 2, 6, -5, 0};
        for(int valor : intArr1){
            System.out.println(valor);
        }
        System.out.println();
        int[] intArr1b = {4, 2, 6, -5, 0};
        for(int i=0; i< intArr1b.length; i++){
            System.out.println(intArr1b[i]);
        }
        System.out.println();

        /*
         **2. Crea un array de 5 enteros pero pide al usuario los
         * 5 números y muéstralos todos en la misma línea.
         */
        System.out.println("***EJERCICIO 2***");
        Scanner scan = new Scanner(System.in);
        int[] intArr2 = new int[5];
        for(int i=0; i< intArr2.length; i++){
            System.out.print("Introduce un número entero: ");
            intArr2[i] = scan.nextInt();
        }

        for(int i=0; i< intArr2.length; i++){
            System.out.print(intArr2[i] + " ");
        }
        System.out.println();
        System.out.println();

        /*
         **3. Crea un array de 3 valores de tipo float distintos y
         * calcula la suma de sus valores.
         */
        System.out.println("***EJERCICIO 3***");
        float[] floatArr = {3.5f, -2f, 900f};
        float ac = 0f;
        for(int i=0; i< floatArr.length; i++) {
            ac += floatArr[i];
        }
        System.out.println("La suma de los elementos es: " + ac);
        System.out.println();

        /*
         **4. Calcula también la media de los valores del array.
         */
        System.out.println("***EJERCICIO 4***");
        System.out.println("La media es: " + ac / floatArr.length);
        System.out.println();

        /*
         **5. Pide al usuario los nombre de cuatro personas y guárdalos
         * en un array. Imprime todos los nombres en la misma línea.
         */
        System.out.println("***EJERCICIO 5***");
        String[] strArr = new String[4];
        for(int i=0; i< strArr.length; i++){
            System.out.print("Introduce un nombre (no compuesto): ");
            strArr[i] = scan.next();
        }

        for(int i=0; i< strArr.length; i++){
            System.out.print(strArr[i] + " ");
        }
        System.out.println();
        System.out.println();

        /*
         **6. Partiendo de un array de enteros creado por tí, imprime
         * los valores de las posiciones pares en una misma línea.
         */
        System.out.println("***EJERCICIO 6***");
        int[] intArr6 = {3, -2, 6, -100, 5, -7};
        for(int i=0; i< intArr6.length; i += 2){
            System.out.print(intArr6[i] + " ");
        }
        System.out.println();
        System.out.println();

        /*
         **7. Repite pero con las posiciones impares.
         */
        System.out.println("***EJERCICIO 7***");
        int[] intArr7 = {3, -2, 6, -100, 5, -7};
        for(int i=1; i< intArr7.length; i += 2){
            System.out.print(intArr7[i] + " ");
        }
        System.out.println();
        System.out.println();

        /*
         **8. Imprime el contenido del array en orden inverso, es decir,
         * desde el final hasta el principio.
         */
        System.out.println("***EJERCICIO 8***");
        int[] intArr8 = {3, -2, 6, -100, 5, -7};
        for(int i=intArr8.length-1; i >=0 ; i--){
            System.out.print(intArr8[i] + " ");
        }
        System.out.println();
        System.out.println();

        /*
         **9. Busca el valor 0 en el array, y devuelve la posición en la que
         * se encuentra o -1 en caso de no aparecer.
         */
        System.out.println("***EJERCICIO 9***");
        int[] intArr9 = {3, -2, 6, 9, 5, -7};
        int pos = -1;
        for(int i=0; i< intArr9.length; i++){
            if(intArr9[i] == 0) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);
        System.out.println();

        /*
         **10. Imprime el elemento mayor.
         */
        System.out.println("***EJERCICIO 10***");
        int[] intArr10 = {3, -2, 6, 9, 5, -7};
        int max = intArr10[0];
        int min = intArr10[0];
        for(int i=1; i< intArr10.length; i++){
            if(intArr10[i] > max) {
                max = intArr10[i];
            } else if(intArr10[i] < min) {
                min = intArr10[i];
            }
        }
        System.out.println("El maximo es: " + max);
        System.out.println();

        /*
         **11. Imprime el elemento menor.
         */
        System.out.println("***EJERCICIO 11***");
        System.out.println("El minimo es: " + min);
        System.out.println();

        /*
         **12. Partiendo de dos arrays de enteros del mismo tamaño, suma
         * cada una de sus posiciones y almacena los resultados en un
         * tercer array.
         */
        System.out.println("***EJERCICIO 12***");
        int[] intArr12a = {3, -2, 6, 9, 5, -7};
        int[] intArr12b = {3, -2, 6, 9, 5, -7};
        int[] res = new int[intArr12a.length];
        for(int i=0; i<res.length; i++) {
            res[i] = intArr12a[i] + intArr12b[i];
        }
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();

    }
}