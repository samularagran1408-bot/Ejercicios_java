import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scan.nextLine();
        int contarPalabras = 0;
        int contarLetras = 0;
        int contarEspacios = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                contarEspacios++;
            } else if (Character.isLetter(c)) {
                contarLetras++;
            }
        }

        

        contarPalabras = frase.split(" ").length;//Divide la frase en subcadenas que son palabras
        System.out.println("Palabras: " + contarPalabras);
        System.out.println("Letras: " + contarLetras);
        System.out.println("Espacios: " + contarEspacios);
        scan.close();
    }
}
