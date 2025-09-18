import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int cantidad = sc.nextInt();
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese una nota: ");
            int nota = sc.nextInt();
            suma += nota;

            // La primera nota si o si siempre es la mas alta o la mas baja
            // Para ello estas condiciones son trabajadas con el ingresado anterior
            if (nota > mayor) {
                mayor = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }
        double promedio = (double)suma / cantidad;
        System.out.println("El promedio es: " + promedio);
        System.out.println("La nota más alta es: " + mayor);
        System.out.println("La nota más baja es: " + menor);
        
        sc.close();
    }
}
