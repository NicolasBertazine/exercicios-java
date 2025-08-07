package exercicios.exe04.dominio;

public class Produto {
    private final String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int qtd) {
        quantidade = getQuantidade() + qtd;
        System.out.println("Você adicionou um " + getNome() + " no estoque.");
    }

    public void removerEstoque(int qtd) {
        quantidade = getQuantidade() - qtd;
        System.out.println("Você removeu um " + getNome() + " no estoque.");
    }

    public void valorTotalEmEstoque() {
        preco = getPreco() * getQuantidade();
        System.out.println("Valor total em estoque: R$" + preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
