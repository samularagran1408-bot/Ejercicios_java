import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        int suma=0;

        for (int i = 2; i <= numero; i+=2) {
            System.out.println(suma + " + " + i + " = " + (suma + i));
            suma += i; //suma de los pares
        }
        System.out.println("El total de los pares es: " + suma);
        sc.close();
    }
}