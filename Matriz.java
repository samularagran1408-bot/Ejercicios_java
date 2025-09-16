import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];

        System.out.println("Ingrese los valores de la primera matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        // 2. Calcular suma de diagonales
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            sumaPrincipal += matriz1[i][i];           // diagonal principal
            sumaSecundaria += matriz1[i][2 - i];      // diagonal secundaria
        }

        // 3. Mostrar resultados
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSuma diagonal principal: " + sumaPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaSecundaria);

        sc.close();
    }
}
