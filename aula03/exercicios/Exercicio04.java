package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0, cont = 1;

        System.out.printf("Digite o %d° número: ", cont);
        numero = entrada.nextInt();

        while (numero != 0) {
            soma = soma + numero;
            cont++;
            System.out.printf("Digite o %d° número: ", cont);
            numero = entrada.nextInt();
            }

        System.out.println("A soma dos valores é: " + soma);

        entrada.close();
    }
}
