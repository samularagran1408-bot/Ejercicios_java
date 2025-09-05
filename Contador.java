import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Contador de positivos, negativos y cero: ");
        int positivos = 0;
        int negativos = 0;
        int cero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            int numero = sc.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                cero++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Cero: " + cero);

        sc.close();
    }
}
