package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ladoA, ladoB, ladoC;

        System.out.println("Qual o comprimento do lado A?");
        ladoA = entrada.nextDouble();
        System.out.println("Qual o comprimento do lado B?");
        ladoB = entrada.nextDouble();
        System.out.println("Qual o comprimento do lado C?");
        ladoC = entrada.nextDouble();

        if((ladoA > (ladoB + ladoC)) || (ladoB > (ladoA + ladoC)) || (ladoC > (ladoA + ladoB))) {
            System.out.println("Não é um triângulo.");
        } else {
            if((ladoA == ladoB) && (ladoB == ladoC)) {
                System.out.println("É um triângulo equilátero.");
            } else {
                if((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {
                    System.out.println("É um triângulo isósceles.");
                } else {
                    System.out.println("É um triângulo escaleno.");
                }
            }
        }

        entrada.close();
    }
}
