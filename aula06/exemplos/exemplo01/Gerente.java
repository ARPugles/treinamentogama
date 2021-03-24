public class Gerente extends Funcionario {
    private int numeroFuncionarios;

    public Gerente(String nome, double salario, int funcionarios) {
        super(nome, salario); // chamada ao construtor de Funcionario
        numeroFuncionarios = funcionarios;
    }

    @Override // anotação
    public String exibir() {
        return super.exibir() + " - " + numeroFuncionarios;
    }

    @Override
    public void setAumento(double percentual) {
        // TODO Auto-generated method stub
        super.setAumento(percentual + 20);
    }
}
