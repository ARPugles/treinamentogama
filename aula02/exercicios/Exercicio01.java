package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("Digite ujm valor: ");
        valor = entrada.nextInt();

        if (valor > 20) {
            System.out.println("Metada = " + ((double) valor / 2));
        }

        entrada.close();
    }
}
