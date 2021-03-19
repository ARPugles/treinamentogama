package exemplos.exemplo03;

public class AppPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Alexandre"); // instanciação do objeto, criando o objeto
        Pessoa p2 = new Pessoa("Roberto");

        // p.nome = "Alexandre";
        p.apresentar();

        // p2.nome = "Roberto";
        p2.apresentar();
    }
    
}
