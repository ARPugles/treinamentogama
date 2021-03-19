package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdQuilowatt;
        double salarioMinimo, valorQuilowatt, custoResidencia;

        System.out.print("Entre com o salário: ");
        salarioMinimo = entrada.nextDouble();
        System.out.println(" ");

        System.out.print("Entre com os quilowatts: ");
        qtdQuilowatt = entrada.nextInt();
        System.out.println(" ");

        valorQuilowatt = salarioMinimo / 500;
        System.out.println("O valor do quilowatt é: " + valorQuilowatt);

        custoResidencia = valorQuilowatt * qtdQuilowatt;
        System.out.println("O valor da residência a ser pago é: " + custoResidencia);

        custoResidencia = custoResidencia * 0.85;
        System.out.println("O valor com 15% de desconto é: " + custoResidencia);

        entrada.close();
    }
}
