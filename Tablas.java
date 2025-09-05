import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        System.out.println("Tabla del " + num + ": ");
        for (int i = 1; i <= 10; i++) {
            int tabla = num * i;
            System.out.println(num + " * " + i + " = " + tabla);
        }
        scanner.close();
    }
}
