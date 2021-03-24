public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0;
    }

    public Funcionario() { // default ou padrão

    }

    public String exibir() {
        return nome + " : " + salario;
    }

    public void setAumento(double percentual) {
        salario = (salario * (percentual /100)) + salario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome + " : " + salario;
    }
}
