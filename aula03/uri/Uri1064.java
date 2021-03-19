package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, media;
        int qtdNumeros;

        media = 0;
        qtdNumeros = 0;
        
        for(int cont = 1; cont <= 6; cont++) {
            numero = entrada.nextDouble();
            if(numero > 0) {
                media = media + numero;
                qtdNumeros = qtdNumeros + 1;
            }
        }

        System.out.println(qtdNumeros + " valores positivos");
        media = media / qtdNumeros;
        System.out.printf("%.1f\n", media);

        entrada.close();
    }
}
