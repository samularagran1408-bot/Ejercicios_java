import java.util.Scanner;

public class Traspuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Generar matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + "Fila: " + (i + 1) + "][" + "Columna: " + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Traspuesta de la matriz
        int[][] traspuesta = new int[columnas][filas];
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {  //Cambiamos de posicion las filas y columnas
                traspuesta[i][j] = matriz[j][i];//para que la matriz se pueda intercalar
            }
        }

        // Mostrar matriz traspuesta
        System.out.println("\nMatriz traspuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {// Lo mismo hacemos acá
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
