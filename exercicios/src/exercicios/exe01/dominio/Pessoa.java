package exercicios.exe01.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void fazerAniversario() {
        idade++;
    }

    public void exibirDados() {
        System.out.println(nome);
        System.out.println(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
