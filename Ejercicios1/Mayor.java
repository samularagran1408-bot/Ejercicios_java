import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero mayor y numero menor de 5 numeros: ");
        System.out.print("Ingrese el numero 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        int numero2 = sc.nextInt();
        System.out.print("Ingrese el numero 3: ");
        int numero3 = sc.nextInt();
        System.out.print("Ingrese el numero 4: ");
        int numero4 = sc.nextInt();
        System.out.print("Ingrese el numero 5: ");
        int numero5 = sc.nextInt();

        System.out.println("El mayor es: " + Math.max(numero1, Math.max(numero2, Math.max(numero3, Math.max(numero4, numero5)))));
        System.out.println("El menor es: " + Math.min(numero1, Math.min(numero2, Math.min(numero3, Math.min(numero4, numero5)))));
        sc.close();
    }
}
