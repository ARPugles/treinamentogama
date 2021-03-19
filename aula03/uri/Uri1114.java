package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha;
        final int SENHA_CORRETA = 2002;

        do {
            senha = entrada.nextInt();
            if(senha != SENHA_CORRETA) {
                System.out.println("Senha Invalida");
            }
        } while(senha != SENHA_CORRETA);

        System.out.println("Acesso Permitido");

        entrada.close();
    }
}
