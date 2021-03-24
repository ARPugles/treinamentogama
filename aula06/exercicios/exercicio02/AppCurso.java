public class AppCurso {
    public static void main(String[] args) {
        Estudante e = new Estudante("Alexandre","11 99999-9999","Java");
        Professor p = new Professor("Emerson","11 99999-9999",15900.97);
        // Pessoa pe = new Pessoa("Daniel","11 99999-9999");

        System.out.println(e.exibir());
        System.out.println(p.exibir());
        // System.out.println(pe.exibir());
        System.out.println();
        System.out.println(e);
        System.out.println(p);
        // System.out.println(pe);
    }
    
}
