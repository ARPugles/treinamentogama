package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double qtdKms, qtdMilhas, qtdJardas, qtdPes, qtdPolegadas;

        System.out.print("Entre com a quilometragem: ");
        qtdKms = entrada.nextDouble();

        qtdMilhas = qtdKms * 0.62137;
        qtdJardas = qtdMilhas * 1760;
        qtdPes = qtdJardas * 3;
        qtdPolegadas = qtdPes * 12;

        System.out.printf("Pés: %.2f\n",qtdPes);
        System.out.printf("Polegadas: %.2f\n",qtdPolegadas);
        System.out.printf("Jardas: %.2f\n",qtdJardas);
        System.out.printf("Milhas: %.2f\n",qtdMilhas);

        entrada.close();
    }
}
