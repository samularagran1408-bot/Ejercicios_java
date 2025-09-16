import java.security.SecureRandom;
import java.util.Scanner;

public class ContraseñaRamdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Conjunto de caracteres permitidos
        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?";
        
        // Generador aleatorio seguro
        SecureRandom random = new SecureRandom();
        
        StringBuilder password = new StringBuilder();
        int longitud = 8; // contraseña de 8 caracteres
        
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());//genera caracteres aleatorios hasta llegar a la longitud(8)
            password.append(caracteres.charAt(index));//Coloca caracter por caracter en la contraseña
        }
        
        System.out.println("Contraseña generada: " + password);
        sc.close();
    }
}
