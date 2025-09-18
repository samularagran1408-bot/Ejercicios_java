import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // altura de la pirámide

        for (int i = 1; i <= n; i++) {
            // Espacios a la izquierda
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 1; j <= 2 * i - 1; j++) {//Genera la siguiente fila atraves de impares
                System.out.print("*");
            }

            // Espacios a la derecha (opcional, solo para simetría visual en consola)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Salto de línea
            System.out.println();
        }

        sc.close();
    }
}
