import java.util.Scanner;

public class Sexto {

    public static void main (String[] args) {

        int a, b, c;
        double solucion1, solucion2, enlaraiz;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame el coeficiente a: ");
        a = teclado.nextInt();
        System.out.println("Dame el coeficiente b: ");
        b = teclado.nextInt();
        System.out.println("Dame el coeficiente c: ");
        c = teclado.nextInt();
        enlaraiz = Math.pow(b,2) - 4*a*c;
        System.out.println("en la raiz es " + enlaraiz);
        solucion1 = (-b + Math.sqrt(enlaraiz))/(2*a);
        solucion2 = (-b - Math.sqrt(enlaraiz))/(2*a);

        System.out.println("Las soluciones son: " + solucion1 + " y " + solucion2);
    }
}