package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final String SENHA_PADRAO = "R10p5";
        String senha;

        System.out.print("Digite a senha: ");
        senha = entrada.nextLine();
        System.out.println(" ");

        if(senha.equals(SENHA_PADRAO)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado.");
        }

        entrada.close();
    }
}
