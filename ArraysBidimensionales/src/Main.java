import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****ARRAYS BIDIMENSIONALES*****");
        System.out.println();
        /*
        1. Crear una matriz 3x3

        Crea una matriz de enteros de 3 filas por 3 columnas.
        Asigna manualmente los valores del 1 al 9 y luego muestra su
        contenido por pantalla en formato de tabla.
        */
        System.out.println("***EJERCICIO 1***");
        int[][] enteros1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i=0; i< enteros1.length; i++) {
            for(int j=0; j< enteros1[i].length; j++) {
                System.out.print(enteros1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        2. Matriz identidad

        Escribe un programa que cree una matriz identidad de 4x4
        (unos en la diagonal principal y ceros en el resto) y la imprima.
        */
        System.out.println("***EJERCICIO 2***");
        int[][] identidad2 = new int[4][4];
        for(int i=0; i< identidad2.length; i++) {
         identidad2[i][i] = 1;
        }

        for(int i=0; i< identidad2.length; i++) {
            for(int j=0; j< identidad2[i].length; j++) {
                System.out.print(identidad2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        3. Sumar todos los elementos

        Dada una matriz de enteros de 2x3, inicializada con valores fijos,
        calcula la suma total de todos sus elementos.
        */
        System.out.println("***EJERCICIO 3***");
        int[][] matriz3 = {
                {1, 3, 1},
                {1, 1, 1}
        };

        int suma3 = 0;
        for(int i=0; i< matriz3.length; i++) {
            for(int j=0; j< matriz3[i].length; j++) {
                suma3 += matriz3[i][j];
            }
        }
        System.out.println(suma3);
        System.out.println();

        /*
        4. Contar pares e impares

        Crea una matriz de 3x3 con números enteros. Escribe un
        código que cuente cuántos números pares e impares contiene.
        */
        System.out.println("***EJERCICIO 4***");
        int[][] matriz4 = {
                {2, 3, 4},
                {2, 2, 1},
                {8, 5, 10}
        };

        int pares = 0;
        int impares = 0;
        for(int i=0; i< matriz4.length; i++) {
            for(int j=0; j< matriz4[i].length; j++) {
                if(matriz4[i][j]%2==0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println();

        /*
        5. Buscar un número

        Pide al usuario que introduzca un número entero. Luego,
        búscalo en una matriz de 4x4 que ya contiene valores
        predefinidos. Muestra la posición si lo encuentra o un mensaje
        indicando que no está presente.
        */
        System.out.println("***EJERCICIO 5***");
        int[][] matriz5 = {
                {2, 3, 4, 0},
                {100, 2, 1, 7},
                {4, 5, 10, 11},
                {8, 5, 10, -20}
        };
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num1 = scan.nextInt();
        for(int i=0; i< matriz5.length; i++) {
            for(int j=0; j< matriz5[i].length; j++) {
                if(matriz5[i][j] == num1) {
                    System.out.println("i: " + i);
                    System.out.println("j: " + j);
                    System.out.println("Encontrado!!!");
                }
            }
        }
        System.out.println();

        /*
        6. Intercambiar filas

        Dada una matriz de enteros 3x3, escribe un código que intercambie
        la primera fila con la tercera.
        */
        System.out.println("***EJERCICIO 6***");
        int[][] matriz6 = {
                {2, 3, 4},
                {2, 2, 1},
                {8, 5, 10}
        };
        int[] temp = matriz6[0];
        matriz6[0] = matriz6[2];
        matriz6[2] = temp;

        for(int i=0; i< matriz6.length; i++) {
            for(int j=0; j< matriz6[i].length; j++) {
                System.out.print(matriz6[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        7. Promedio por fila

        Dada una matriz de 3x4 de números enteros, calcula y muestra
        el promedio de los elementos de cada fila por separado.
        */
        System.out.println("***EJERCICIO 7***");
        int[][] matriz7 = {
                {3, 3, 3, 3},
                {1, 1, 1, 1},
                {8, 5, 10, 0}
        };
        for(int[] fila : matriz7) {
            int suma = 0;
            for(int numero : fila) {
                suma += numero;
            }
            System.out.println("Media: " + ((float) suma)/fila.length);
        }
        System.out.println();

        /*
        8. Matriz de tamaño aleatorio

        Lee dos números enteros y crea una matriz de ese tamaño.
        */
        System.out.println("***EJERCICIO 8***");
        System.out.print("Introduce las filas: ");
        int filas = scan.nextInt();
        System.out.print("Introduce las columnas: ");
        int columnas = scan.nextInt();
        int[][] matriz = new int[filas][columnas];
        for(int i=0; i< matriz.length; i++) {
            for(int j=0; j< matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        9. Diagonal secundaria

        Rellena una matriz de 4x4 con números consecutivos del 1 al 16.
        Luego imprime los elementos que están en la diagonal secundaria
        (de la esquina superior derecha a la inferior izquierda).
        */
        System.out.println("***EJERCICIO 9***");
        int[][] matriz9 = new int[4][4];
        int numero = 1;
        for(int i=0; i< matriz9.length; i++) {
            for(int j=0; j< matriz9[i].length; j++) {
                matriz9[i][j] = numero;
                numero++;
            }
        }

        for(int i=0; i< matriz9.length; i++) {
            for(int j=0; j< matriz9[i].length; j++) {
                System.out.printf("%3d", matriz9[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int fila = 0;
        int columna = matriz9[0].length-1;
        for(int cont=0; cont< matriz9.length; cont++) {
            System.out.println(matriz9[fila][columna]);
            fila++;
            columna--;
        }
        System.out.println();

        /*
        10. Reemplazar negativos

        Dada una matriz de 2x5 que contiene tanto números positivos como
        negativos, reemplaza todos los valores negativos por cero.
         */
        System.out.println("***EJERCICIO 10***");
        int[][] matriz10 = {
                {3, -3, 3, -3, 6},
                {8, -5, 10, 0, -7}
        };
        for(int i=0; i< matriz10.length; i++) {
            for(int j=0; j< matriz10[i].length; j++) {
                if(matriz10[i][j] < 0) {
                    matriz10[i][j] = 0;
                }
            }
        }

        for(int i=0; i< matriz10.length; i++) {
            for(int j=0; j< matriz10[i].length; j++) {
                System.out.printf("%3d", matriz10[i][j]);
            }
            System.out.println();
        }

    }
}