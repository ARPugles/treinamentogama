package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor = 345.987;
        int numero = 34;
        String nome = "Alexandre";

        System.out.println(valor);
        // System.out.printf(formato,variáveis)
        // %d - in  %f - double  %s - string
        System.out.printf("%f\n",valor);
        System.out.printf("%.2f\n",valor);

        System.out.printf("int = %d, double = %.2f\n", numero, valor);
        System.out.printf("Nome = %s, - %d\n", nome, numero);
    }
}
