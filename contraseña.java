import java.util.Scanner;

public class contraseña {
    public static void main(String[] args) {
        String contraseña2 = "erda4/3";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una contraseña: ");
        String contraseña = sc.nextLine();
        
        

        while (!contraseña.equals(contraseña2)) {
            System.out.println("Ingrese una contraseña: ");
            contraseña = sc.nextLine();

            if (contraseña.equals(contraseña2)) {
                System.out.println("¡Bienvenido!");
            } else {
                System.out.println("Contraseña incorrecta, inténtelo de nuevo.");
            }
        }
        
        sc.close();
    }
}
