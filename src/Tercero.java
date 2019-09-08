import java.util.Scanner;

public class Tercero{
    public static void main(String[] args) {
        double base, altura, perimetro, area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        base = teclado.nextInt();

        System.out.println("Introduce la altura: ");
        altura = teclado.nextInt();

        area = base * altura;
        perimetro = 2 * base + 2 * altura;

        System.out.println("El área es: " + (area));
        System.out.println("El perímetro es: " + perimetro);

    }
}