import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("¿Cuántos productos vas a comprar? ");
        Integer cantidad = sc.nextInt();

        int total = 0;

        for (Integer i = 0; i < cantidad; i++){
            System.out.println("Ingrese el precio del producto " + (i + 1) + ": ");
            Double precio = sc.nextDouble();
            total += precio;
        }
        System.out.println("Listo, " + nombre + ", debes pagar " + total + " pesos");
        sc.close();
    }
}
