import java.util.Scanner;

public class NumeroMagico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de mas de una cifra: ");
        int numero = sc.nextInt();
        int resultado = numero;
        while (resultado >= 10) {
            int suma = 0;
            int digito = resultado;
            while (digito > 0) {
                suma += digito % 10;//ultimo digito es trabajado
                digito /= 10;//se elimina el ultimo digito
            }
            resultado = suma;
        }
        if (resultado == 1) {
            System.out.println("El número es mágico");
        } else {
            System.out.println("El número no es mágico");
        }
        sc.close();
    }
}
