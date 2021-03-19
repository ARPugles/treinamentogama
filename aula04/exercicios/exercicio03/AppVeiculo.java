package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculoInformado = new Veiculo("Fiat", "Uno", 11);

        veiculoInformado.dadosVeiculo();
        System.out.println("Consumo: " + veiculoInformado.obterConsumo() + " Km por litro.");
    }
}