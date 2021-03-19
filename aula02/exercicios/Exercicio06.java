package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Qual o salário?");
        salario = entrada.nextDouble();

        if(salario > 2000) {
            System.out.println("30%");
        } else {
            if(salario > 1200) {
                System.out.println("25%");
            } else {
                if(salario > 600) {
                    System.out.println("20%");
                } else {
                    System.out.println("Isento");
                }
            }
        }

        entrada.close();
    }
}
