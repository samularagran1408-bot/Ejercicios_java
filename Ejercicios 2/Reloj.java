import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int h = 0; h < 24; h++) {         // horas
            for (int m = 0; m < 60; m++) {     // minutos
                for (int s = 0; s < 60; s++) { // segundos
                    // Formato HH:MM:SS con dos dígitos
                    // %d → significa entero decimal
                    // 2 → significa el ancho para que ocupe 2 posiciones
                    // 0 → relleno con ceros a la izquierda si el número tiene menos de 2 dígitos
                    System.out.println(String.format("%02d:%02d:%02d", h, m, s));
                }
            }
        }
        scan.close();
    }
}
