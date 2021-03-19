package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado, numeroDigitado;

        System.out.print("Digite um número: ");
        numeroDigitado = entrada.nextInt();
        System.out.println();

        resultado = testePar(numeroDigitado);

        if(resultado > 0) {
            System.out.println("O número não é par");
        } else {
            System.out.println("O número é par");
        }
    }

    static int testePar(int numero) {
        int parSim;

        parSim = numero % 2;
        return parSim;
    }
 
}
