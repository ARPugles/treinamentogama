import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        
        ArrayList<Double> lista = new ArrayList<>();

        lista.add(1.1);
        lista.add(1.2);
        lista.add(1.3);
        lista.add(1.4);

        System.out.println(lista);

        for (Double numero : lista) { // para cada 'numero' da estrutura 'lista' faça
            System.out.println(numero);
        }

        for (int i = 0; i < lista.size();) {
            System.out.println(lista.get(i));
            if(lista.get(i) == 1.3) {
                System.out.println("Achei o valor " + lista.get(i) + " na posição " + i);
                System.out.println("Removendo...");
                lista.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(lista);
    }
}
