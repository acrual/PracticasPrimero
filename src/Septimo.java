import java.util.Scanner;

public class Septimo {

    public static void main (String[] args) {
        int dia1, mes1, anyo1, dia2, mes2, anyo2, dif;

        System.out.println("Dia, mes y anyo 1: ");
        Scanner teclado = new Scanner(System.in);
        dia1 = teclado.nextInt();
        mes1 = teclado.nextInt();
        anyo1 = teclado.nextInt();
        System.out.println("Dia, mes y anyo 2: ");
        dia2 = teclado.nextInt();
        mes2 = teclado.nextInt();
        anyo2 = teclado.nextInt();

        dif = 365*(anyo2-anyo1) + 30*(mes2-mes1) + dia2 - dia1;
        System.out.println("La diferencia en dias es: " + dif);
    }
}