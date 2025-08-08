package exercicios.exe09.dominio;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("CARRO");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de portas: " + getQuantidadeDePortas());
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
}
