package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaA, notaB, notaC, media;

        notaA = teclado.nextDouble();
        notaA = notaA * 2;
        notaB = teclado.nextDouble();
        notaB = notaB * 3;
        notaC = teclado.nextDouble();
        notaC = notaC * 5;

        media = (notaA + notaB + notaC) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();
    }
}
