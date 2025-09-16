import java.util.Scanner;
import java.util.Random;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(50);
        int intento = 0;

        System.out.println("Adivina el numero secreto entre el 1 y el 50");

        while (secreto != intento) {
            System.out.print("Ingrese el numero: ");
            intento = sc.nextInt();
            if (intento > secreto) {
                System.out.println("Ingresa un numero menor");
            } else if (intento < secreto) {
                System.out.println("Ingresa un numero mayor");
            } else {
                System.out.println("¡Ganaste!");
            }
        }
        sc.close();
    }
}