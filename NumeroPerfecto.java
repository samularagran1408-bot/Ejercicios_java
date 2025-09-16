import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número
        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();
        int sumaDivisores = 0;

        // Sumar los divisores
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Comprobar si es perfecto
        if (sumaDivisores == numero) {
            System.out.println("\nEl número es perfecto.");
        } else {
            System.out.println("\nEl número no es perfecto.");
        }

        
        sc.close();
    }
}