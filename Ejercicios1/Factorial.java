import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        Long factorial = 1L;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        sc.close();
    }
}
