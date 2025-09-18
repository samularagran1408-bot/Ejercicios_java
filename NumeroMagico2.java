import java.util.Scanner;

public class NumeroMagico2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de más de una cifra: ");
        int numero = sc.nextInt();

        // Repetimos hasta que quede un solo dígito
        while (numero > 9) {
            String numCadena = String.valueOf(numero);//Convierte el número a cadena para
            String[] digitos = numCadena.split("");//poder separar los digitos
            int suma = 0;

            for (String digito : digitos) {//Recorremos cada dígito
                suma += Integer.parseInt(digito);//Convertimos cada dígito a entero y los sumamos
            }

            numero = suma; // Actualizamos el numero
        }

        if (numero == 1) {
            System.out.println("El número es mágico");
        } else {
            System.out.println("El número no es mágico");
        }
        sc.close();
    }
}
