package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        System.out.println("Qual o valor do salário bruto?");
        salario = entrada.nextDouble();

        System.out.println("Qual o valor da prestação?");
        prestacao = entrada.nextDouble();

        if(prestacao > (salario * 0.3)) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

        entrada.close();
    }
}
