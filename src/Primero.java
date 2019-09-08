import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = teclado.nextInt();
        System.out.println("El número que has introducido es " + num);
    }
}