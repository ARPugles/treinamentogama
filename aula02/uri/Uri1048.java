package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, reajuste;
        String percentual;
        
        salario = entrada.nextDouble();

        if((salario >= 0) && (salario <= 400)) {
            percentual = "15 %";
            reajuste = salario * 0.15;
            salario = salario + reajuste;
        } else {
            if((salario > 400) && (salario <= 800)) {
                percentual = "12 %";
                reajuste = salario * 0.12;
                salario = salario + reajuste;
            } else {
                if((salario > 800) && (salario <= 1200)) {
                    percentual = "10 %";
                    reajuste = salario * 0.10;
                    salario = salario + reajuste;
                } else {
                    if((salario > 1200) && (salario <= 2000)) {
                        percentual = "7 %";
                        reajuste = salario * 0.07;
                        salario = salario + reajuste;
                    } else {
                        percentual = "4 %";
                        reajuste = salario * 0.04;
                        salario = salario + reajuste;
                    }
                }
            }
        }

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual);

        entrada.close();
    }
}
