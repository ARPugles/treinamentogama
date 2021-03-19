package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota, mediaNota, media;
        int validas;

        validas = 0;
        media = 0;

        while(validas < 2){
            nota = entrada.nextDouble();
            if((nota < 0) || (nota > 10)) {
                System.out.println("nota invalida");
            } else {
                media = media + nota;
                validas = validas + 1;
            }
        }
        media = media / validas;
        System.out.printf("media = %.2f\n", media);

        entrada.close();
    }
}
