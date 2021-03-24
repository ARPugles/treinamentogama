import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1,"Um");
        mapa.put(2,"Dois");
        mapa.put(3,"Três");
        mapa.put(4,"Quatro");

        System.out.println(" 3 = " + mapa.get(3));
        System.out.println(" 3 = " + mapa.get(32));
    }
    
}
