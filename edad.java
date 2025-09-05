import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creamos un objeto de la clase Scanner para poder leer datos del teclado

        System.out.print("Ingrese su edad: ");
        Integer edad = scanner.nextInt();//leemos la edad del usuario y la almacenamos en la variable edad

        if (edad >= 1 && edad <= 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres una adulto");
        } else if (edad >= 60 && edad <= 100) {
            System.out.println("Eres un veterano");
        } else {
            System.out.println("Edad invalida");
        }
        scanner.close();//cerramos el objeto scanner para liberar memoria
    }
}
