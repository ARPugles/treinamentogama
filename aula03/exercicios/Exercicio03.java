package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, multi;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        System.out.println();

        multi = 1;

        while (multi <= numero) {
            if (multi >= (numero / 2)){
                System.out.print(multi);
            } else {
                System.out.print(multi + ", ");
            }
            multi *= 2;
        }

        entrada.close();
    }
}
