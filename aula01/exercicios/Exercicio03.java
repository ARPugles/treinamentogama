package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioatual, salarionovo;

        System.out.print("Digite o salário atual: ");
        salarioatual = entrada.nextDouble();

        salarionovo = salarioatual * 1.25;
        System.out.println("O novo salário é: " + salarionovo);

        entrada.close();
    }
}
