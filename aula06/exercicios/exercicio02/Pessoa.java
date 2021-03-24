public abstract class Pessoa {
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String exibir() {
        return nome + " - Telefone: " + telefone;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome + " - Telefone: " + telefone;
    }
    
}
