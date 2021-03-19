package exercicios.exercicio04;

public class Relogio {
    private int aHora, oMinuto, oSegundo;

    public Relogio(int aHora, int oMinuto, int oSegundo) {
        setHora(aHora);
        setMinuto(oMinuto);
        setSegundo(oSegundo);
    }

    public void setHora(int aHora) {
        if((aHora > -1) && (aHora < 24)) {
            this.aHora = aHora;
        }
    }

    public int getHora() {
        return aHora;
    }

    public void setMinuto(int oMinuto) {
        if((oMinuto > -1) && (oMinuto < 60)) {
            this.oMinuto = oMinuto;
        }
    }

    public int getMinuto() {
        return oMinuto;
    }

    public void setSegundo(int oSegundo) {
        if((oSegundo > -1) && (oSegundo < 60)) {
            this.oSegundo = oSegundo;
        }
    }

    public int getSegundo() {
        return oSegundo;
    }

}
