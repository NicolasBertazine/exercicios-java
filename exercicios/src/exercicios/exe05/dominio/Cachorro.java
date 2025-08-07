package exercicios.exe05.dominio;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro " + getNome() + " com a idade " + getIdade() + ". Faz o som au au!");
    }
}
