import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int n = sc.nextInt();

        int[][] pascal = new int[n][n];

        // Generar triángulo
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1; // primer elemento de cada fila
            pascal[i][i] = 1; // último elemento de cada fila

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];//El valor en la posición [i][j] (fila actual)
                                                                        //= suma de los dos valores de la fila anterior (i - 1)
            }
        }

        // Imprimir triángulo (centrado un poco)
        for (int i = 0; i < n; i++) {
            // espacios a la izquierda para centrar
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
