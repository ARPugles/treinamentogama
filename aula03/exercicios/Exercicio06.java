package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, numero, par = 0, impar = 0;
        double media = 0, percentual = 0;

        for(cont = 1; cont <=10; cont++) {
            System.out.print("Digite o " + cont + "° número: ");
            numero = entrada.nextInt();
            if((numero % 2) == 0) {
                par = par + 1;
                media = media + numero;
            } else {
                impar = impar +1;
            }
        }

        System.out.println();

        media = media / par;
        System.out.printf("A média dos valores dos números pares é: %.1f\n", media);

        percentual = ((double)impar * 100) / ((double)cont - 1);
        System.out.printf("O percentual de números ímpares digitados é: %.1f", percentual);
        System.out.println("%");

        entrada.close();        
    }
}
