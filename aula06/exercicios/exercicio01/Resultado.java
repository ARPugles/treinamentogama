public class Resultado {
    public static void main(String[] args) {
        Placar p1 = new Placar("Palmeiras",1,"Santos",0);
        Placar p2 = new Placar("Palmeiras","Santos");
        Placar p3 = new Placar();

        System.out.println(p1.exibir());
        System.out.println(p2.exibir());
        System.out.println(p3.exibir());
    }
}
