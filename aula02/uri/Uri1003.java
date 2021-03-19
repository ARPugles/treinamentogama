package uri;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, soma;

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        soma = n1 + n2;

        System.out.println("SOMA = " + soma);

        teclado.close();
    }
}
