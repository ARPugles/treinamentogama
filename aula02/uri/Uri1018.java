package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, ced100, ced50, ced20, ced10, ced5, ced2, ced1, resto;

        valor = entrada.nextInt();

        ced100 = valor / 100;
        resto = valor % 100;
        ced50 = resto / 50;
        resto = resto % 50;
        ced20 = resto / 20;
        resto = resto % 20;
        ced10 = resto / 10;
        resto = resto % 10;
        ced5 = resto / 5;
        resto = resto % 5;
        ced2 = resto / 2;
        resto = resto % 2;
        ced1 = resto / 1;
        resto = resto % 1;

        System.out.println(valor);
        System.out.println(ced100 + " nota(s) de R$ 100,00");
        System.out.println(ced50 + " nota(s) de R$ 50,00");
        System.out.println(ced20 + " nota(s) de R$ 20,00");
        System.out.println(ced10 + " nota(s) de R$ 10,00");
        System.out.println(ced5 + " nota(s) de R$ 5,00");
        System.out.println(ced2 + " nota(s) de R$ 2,00");
        System.out.println(ced1 + " nota(s) de R$ 1,00");

        entrada.close();
    }
}
