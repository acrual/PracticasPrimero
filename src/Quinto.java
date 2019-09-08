import java.util.Scanner;

public class Quinto{

    public static void main(String[] args) {

        float precio, total;
        Scanner teclado = new Scanner(System.in);

        final int IVA = 21;
        System.out.println("Introduce el precio: ");
        precio = teclado.nextFloat();
        total = precio + (precio * IVA/100);

        System.out.println("El precio total con IVA es: " + total );
    }
}