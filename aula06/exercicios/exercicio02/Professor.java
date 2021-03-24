public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String telefone, double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    public String exibir() {
        return super.exibir() + " - Salário: " + salario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - Salário: " + salario;
    }
}
