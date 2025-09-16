import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud un numero: ");
        String numero = sc.nextLine();
        String invertido = new StringBuilder(numero).reverse().toString();
        if (numero.equals(invertido)) {
            System.out.println("Es un numero capicua");
        } else {
            System.out.println("No es un numero capicua");
        }
        sc.close();
    }
}
