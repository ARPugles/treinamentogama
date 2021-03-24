import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> hashContas;  // <Key, valor>, Key = número da conta, valor = Conta
    private GerarNumero gerarNumero;

    public GerenciaContas() {
        hashContas = new HashMap<>();
        gerarNumero = new GerarNumero();
    }

    public int novaContaCorrente() {
        int numeroConta = gerarNumero.proximo();
        hashContas.put(numeroConta, new ContaCorrente(numeroConta));
        return numeroConta;
    }

    public int novaContaEspecial(double limite) {
        int numeroConta = gerarNumero.proximo();
        hashContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
        return numeroConta;
    }

    public int novaContaPoupanca() {
        int numeroConta = gerarNumero.proximo();
        hashContas.put(numeroConta, new ContaPoupanca(numeroConta));
        return numeroConta;
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta contaEncontrada = hashContas.get(numeroConta); // busca a conta cuja chave é 'numeroConta'
        if(contaEncontrada != null) {
            if(contaEncontrada.deposito(valor)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta contaEncontrada = hashContas.get(numeroConta); // busca a conta cuja chave é 'numeroConta'
        if(contaEncontrada != null) {
            if(contaEncontrada.saque(valor)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String consultarConta(int numeroConta) {
        Conta contaEncontrada = hashContas.get(numeroConta);
        if(contaEncontrada != null) {
            return(contaEncontrada.toString());
        }
        return "Conta não encontrada.";
    }
}