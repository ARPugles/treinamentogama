package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorA, valorB, valorC, valorD;

        valorA = entrada.nextInt();
        valorB = entrada.nextInt();
        valorC = entrada.nextInt();
        valorD = entrada.nextInt();

        if((valorB > valorC) && (valorD > valorA) && ((valorC + valorD) > (valorA + valorB)) && (valorC > 0) && (valorD > 0) && ((valorA % 2) == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        entrada.close();
    }
}
