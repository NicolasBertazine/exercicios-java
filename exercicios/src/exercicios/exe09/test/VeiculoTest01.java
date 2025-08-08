package exercicios.exe09.test;

import exercicios.exe09.dominio.Carro;
import exercicios.exe09.dominio.Moto;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Twister 300F", 300);
        Carro carro = new Carro("BMW", "320i", 4);

        moto.exibirInformacoes();
        System.out.println("------------------");
        carro.exibirInformacoes();
    }
}
