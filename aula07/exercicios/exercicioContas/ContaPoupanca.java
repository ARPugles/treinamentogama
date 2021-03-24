public class ContaPoupanca extends Conta {
    private static double taxa = 0.1; // atributo de classe

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxa(double novaTaxa) {
        if(novaTaxa > 0) {
            taxa = novaTaxa;
        }
    }

    @Override
    public boolean saque(double valor) {
        if(valor + taxa <= getSaldo()) {
            return super.saque(valor + taxa);
        }
        return false;
    }

    @Override
    public String toString() {
        return  super.toString() + " taxa: " + taxa;
    }

}