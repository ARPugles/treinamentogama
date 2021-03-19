package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codPeca, qtdPeca;
        double valorUnitario, totalPagar;

        codPeca = entrada.nextInt();
        qtdPeca = entrada.nextInt();
        valorUnitario = entrada.nextDouble();
        totalPagar = qtdPeca * valorUnitario;
        codPeca = entrada.nextInt();
        qtdPeca = entrada.nextInt();
        valorUnitario = entrada.nextDouble();
        totalPagar = totalPagar + (qtdPeca * valorUnitario);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);

        entrada.close();
    }
}
