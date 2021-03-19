package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        /*
        entrada - ler duas notas
        processamento - calcular a média
        saída - exibir a média
        */

        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, notamedia;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("A primeira nota é: " + nota1);
        
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("A segunda nota é: " + nota2);

        notamedia = (nota1 + nota2) / 2.0;
        System.out.println("A média das notas é: " + notamedia);

        entrada.close();
    }
}
