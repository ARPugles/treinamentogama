package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int resultado;

        resultado = eMenor(15, 15, 15);
        System.out.println(resultado);
    }

    static int eMenor(int numero1, int numero2, int numero3) {
        int menorNumero;

        if(numero1 < numero2) {
            menorNumero = numero1;
        } else {
            menorNumero = numero2;
        }

        if(menorNumero > numero3) {
            menorNumero = numero3;
        }

        return menorNumero;

    }
}
