package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, par, impar, positivo, negativo;

        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;

        for(int cont = 0; cont < 5; cont++) {
            valor = entrada.nextInt();

            if((valor % 2) == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }

            if(valor > 0) {
                positivo = positivo + 1;
            } else {
                if(valor < 0){
                    negativo = negativo + 1;
                }
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

        entrada.close();
    }
}
