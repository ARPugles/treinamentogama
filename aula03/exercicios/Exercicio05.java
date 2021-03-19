package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par = 0, impar = 0, numero;

        for(int cont = 1; cont <=10; cont++) {
            System.out.print("Digite o " + cont + "° número: ");
            numero = entrada.nextInt();
            if((numero % 2) == 0) {
                par = par + 1;
            } else {
                impar = impar +1;
            }
        }

        System.out.println("O total de pares é: " + par);
        System.out.println("O total de ímpares é: " + impar);

        entrada.close();
    }
}
