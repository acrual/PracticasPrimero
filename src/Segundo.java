import java.util.Scanner;

public class Segundo {

    public static void main(String[] args){


        int num1, num2, res;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        res = num1 + num2;
        System.out.println("La suma es: " + res);
    }
}