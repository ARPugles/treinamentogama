package exercicios.exercicio03;

public class Veiculo {
    String modelo, marca;
    double consumo;

    Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    void dadosVeiculo() {
        System.out.println("Veículo marca " + marca + ", modelo " + modelo + ".");
    }

    double obterConsumo() {
        return consumo;
    }
}
