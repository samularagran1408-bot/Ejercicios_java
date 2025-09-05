import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero:");
        int numero = sc.nextInt();
        int a=0;
        int b=1;

        for (int i = 0; i < numero; i++) {
            System.out.println(a + " ");//esto imprime los numeros de fibonacci

            int siguiente = a+b;
            a=b;
            b=siguiente;
        }
        System.out.println("El numero fibonacci de " + numero + " es " + a);
        sc.close();
    }
}
