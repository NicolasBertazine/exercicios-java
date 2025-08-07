package exercicios.exe02.test;

import exercicios.exe02.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Saveiro");
        carro.setCor("Branca");
        carro.setVelocidadeAtual(150);

        carro.acelerar(200);
        System.out.println("------------------");
        carro.freiar(100);
        System.out.println("------------------");
        carro.exibirDados();
    }
}
