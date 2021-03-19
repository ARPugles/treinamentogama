package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.println("Qual o primeiro número?");
        n1 = entrada.nextDouble();
        System.out.println("Qual o segundo número?");
        n2 = entrada.nextDouble();

        if(n1 > n2){
            System.out.println(n1 + " > " + n2);
        } else{
            if(n1 == n2){
                System.out.println(n1 + " = " + n2);
            } else {
                System.out.println(n2 + " > " + n1);
            }
        }

        entrada.close();
    }
}
