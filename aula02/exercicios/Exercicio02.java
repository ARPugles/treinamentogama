package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Entre com a nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println(" ");

        System.out.print("Entre com a nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println(" ");

        media = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.printf("Media: %.1f\n", media);

        if(media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
