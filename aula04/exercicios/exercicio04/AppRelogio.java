package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio hms = new Relogio(23, 59, 59);

        System.out.printf("%02d:%02d:%02d", hms.getHora(), hms.getMinuto(), hms.getSegundo());

    }
}
