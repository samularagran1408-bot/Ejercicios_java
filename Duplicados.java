import java.util.Scanner;

public class Duplicados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos
        System.out.print("¿Cuántos números desea ingresar?: ");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }

        // Crear nuevo arreglo sin duplicados
        int[] sinDuplicados = new int[cantidad];
        int size = 0;

        for (int i = 0; i < cantidad; i++) {
            boolean repetido = false;
            for (int j = 0; j < size; j++) {//Comprobamos si ya existe el número en el arreglo
                if (numeros[i] == sinDuplicados[j]) {//uno por uno
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {//Dice: "Si NO (!) está repetido entonces:"
                sinDuplicados[size] = numeros[i];//Agregamos el número si no existe
                size++;
            }
        }

        // Mostrar arreglo original
        System.out.print("\nArreglo original: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Mostrar arreglo sin duplicados
        System.out.print("\nArreglo sin duplicados: ");
        for (int i = 0; i < size; i++) {
            System.out.print(sinDuplicados[i] + " ");
        }

        sc.close();
    }
}

