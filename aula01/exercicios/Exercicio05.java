package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorFabrica, valorImposto, valorDistribuidor, valorConsumidor;

        System.out.print("Entre com o preço de fábrica: ");
        valorFabrica = entrada.nextDouble();
        System.out.println(" ");

        valorImposto = valorFabrica * 0.45;
        valorDistribuidor = valorFabrica * 0.28;
        valorConsumidor = valorFabrica + (valorImposto + valorDistribuidor);

        System.out.println("O valor do carro é " + valorConsumidor + " com " + valorImposto + " de imposto.");

        entrada.close();
    }
}
