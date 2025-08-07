package exercicios.exe03.test;

import exercicios.exe03.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Nícolas", 1000);

        contaBancaria.depositar(300);
        contaBancaria.exibirDados();
        System.out.println("------------");
        contaBancaria.sacar(300);
        contaBancaria.exibirDados();
    }
}
