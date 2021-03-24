public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso;
    }

    public String exibir() {
        return super.exibir() + " - Curso: " + curso;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - Curso: " + curso;
    }
}
