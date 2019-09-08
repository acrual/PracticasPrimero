import java.util.Scanner;

import static java.lang.Math.pow;

public class Cuarto {
    public static void main(String[] args) {

        double radio, area;
        Scanner teclado = new Scanner(System.in);
        final double PI = 3.141592;

        System.out.println("Introduce el radio del círculo: ");
        radio = teclado.nextDouble();

        area = PI * pow(radio, 2);
        System.out.println("El área es: " + area);
    }
}