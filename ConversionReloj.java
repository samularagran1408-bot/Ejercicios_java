import java.util.Scanner;

public class ConversionReloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducee el valor de segundos a convertir: ");
        int valor = sc.nextInt();
        
        int horas = valor / 3600;
        int minutos = (valor % 3600) / 60; //Resto de segundos que no formaron horas exactas
        int segundos = valor % 60; //Resto de segundos que no formaron minutos exactas

        // Formato HH:MM:SS con dos dígitos
        // %d → significa entero decimal
        // 2 → significa el ancho para que ocupe 2 posiciones
        // 0 → relleno con ceros a la izquierda si el número tiene menos de 2 dígitos
        System.out.printf("%d segundos equivalen a %02d:%02d:%02d\n", valor, horas, minutos, segundos);
        sc.close();
    }
}