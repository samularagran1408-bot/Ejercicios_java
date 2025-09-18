import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un entero positivo: ");
        long n = sc.nextLong();

        if (n < 0) {
            System.out.println("Error: debe ser un número entero positivo.");
        } else if (n == 0) {
            System.out.println("Binario: 0");
        } else {
            StringBuilder sb = new StringBuilder();
            long numero = n;// Asignamos el mismo numero para que el while pueda trabajarlo
            while (numero > 0) {
                sb.append(numero % 2); // agrega residuo al final del texto
                numero /= 2;// dividimos el numero para obtener el siguiente residuo
            }
            // los bits están al revés, los invertimos
            sb.reverse();
            System.out.println("Binario: " + sb.toString());
        }

        sc.close();
    }
}
