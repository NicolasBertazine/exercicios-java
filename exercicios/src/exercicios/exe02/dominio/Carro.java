package exercicios.exe02.dominio;

public class Carro {
    private String modelo;
    private String cor;
    private int velocidadeAtual;

    public void acelerar(int incremento) {
        System.out.println("Acelerando!!");
        for (int i = velocidadeAtual; i <= incremento; i += 10) {
            System.out.println("Velocidade Atual: " + i);
        }
    }

    public void freiar(int decremento) {
        System.out.println("Freiando!!");
        for (int i = velocidadeAtual; i >= decremento; i -= 10) {
            System.out.println("Velocidade Atual: " + i);
        }
    }
    public void exibirDados() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Velocidade Atual: "+ getVelocidadeAtual());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
