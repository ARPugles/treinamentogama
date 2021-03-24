public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Fernando", 2000);
        Funcionario f2 = new Funcionario();
        Gerente g = new Gerente("Amanda", 3000, 10);

        g.setAumento(5);
        f.setAumento(10);

        // g.nome = "Fernando";
        System.out.println(g.exibir());
        System.out.println(f.exibir());
        System.out.println(g);
        System.out.println(f);
    }    
}
