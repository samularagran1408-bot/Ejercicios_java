import java.util.Scanner;

public class Cajero {
    // atributo de la clase
    private static Double saldo = 1000000.00;

    // método para consultar saldo
    public static void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public static void retirar(Double cantidad) {
        saldo -= cantidad;
    }

    public static void depositar(Double cantidad) {
        saldo += cantidad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        while (opcion != 4) {
            System.out.println("\n--- Cajero ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    retirar(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    depositar(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        sc.close();
    }
}

