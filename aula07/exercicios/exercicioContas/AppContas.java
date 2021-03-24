import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;
        ContaCorrente cc;
        ContaEspecial ce;
        ContaPoupanca cp;

        ArrayList<Conta> listaContas = new ArrayList<>();

        do {
            System.out.println("1- nova conta corrente");
            System.out.println("2- nova conta especial");
            System.out.println("3- nova conta poupança");
            System.out.println("4- depósito");
            System.out.println("5- saque");
            System.out.println("6- consultar saldo");
            System.out.println("7- sair");
            System.out.print("Opção ==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    listaContas.add(cc);
                    break; // interrompe a execução do case

                case 2:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da conta: ");
                    limite = teclado.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    listaContas.add(ce);
                    break;

                case 3:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    listaContas.add(cp);
                    break;

                case 4:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Qual o valor? ");
                    valor = teclado.nextDouble();
                    for (Conta conta : listaContas) {
                        if(conta.getNumero() == numeroConta) {
                            if(conta.deposito(valor)) {
                                System.out.println("Operação realizada.");
                            } else {
                                System.out.println("Falha na operação");
                            }
                        break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Qual o valor? ");
                    valor = teclado.nextDouble();
                    for (Conta conta : listaContas) {
                        if(conta.getNumero() == numeroConta) {
                            if(conta.saque(valor)) {
                                System.out.println("Operação realizada.");
                            } else {
                                System.out.println("Falha na operação");
                            }
                        break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    for (Conta conta : listaContas) {
                        if(conta.getNumero() == numeroConta) {
                            System.out.println(conta);
                            break;
                        }
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 7);

        teclado.close();
    }
}