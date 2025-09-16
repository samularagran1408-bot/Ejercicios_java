import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
        sc.close();
    }
}
