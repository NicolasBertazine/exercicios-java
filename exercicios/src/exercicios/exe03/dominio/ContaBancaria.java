package exercicios.exe03.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = this.saldo + valor;
        System.out.println("Você depositou R$" + valor);
    }

    public void sacar(double valor) {
        saldo = this.saldo - valor;
        System.out.println("Você sacou R$" + valor);
    }

    public void exibirDados() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
}
