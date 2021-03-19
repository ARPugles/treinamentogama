package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, numero, multi;

        cont = 0;

        System.out.println("Qual número será multiplicado?");
        numero = entrada.nextInt();

        System.out.println("valor digitado: " + numero);
        System.out.println(" ");

        while (cont <=10) {
            System.out.print(numero);
            multi = numero * cont;
            System.out.println(" x " + cont + " = " + multi);
            cont++;
        }

        entrada.close();
    }
}
