public class Placar {
    private String time1, time2;
    private int golsTime1, golsTime2;

    public Placar(String time1, int golsTime1, String time2, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public Placar(String time1, String time2) {
        this(time1,0,time2,0);
    }

    public Placar() {
        this("Time da Casa",0,"Visitantes",0);
    }

    public String exibir() {
        return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2;
    }
}
