package exercicios.exe05.test;

import exercicios.exe05.dominio.Cachorro;
import exercicios.exe05.dominio.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Gato gato = new Gato("Oncinha", 3);
        Cachorro cachorro = new Cachorro("Minininha", 7);

        gato.fazerSom();
        cachorro.fazerSom();
    }
}
