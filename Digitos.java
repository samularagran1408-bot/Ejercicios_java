import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        String numero = sc.nextLine();
        int contador = 0;

        for (int i = 1; i <= numero.length(); i++) {
            contador++;
        }

        System.out.println("La cantidad de dígitos es " + contador);
        sc.close();
    }
}
