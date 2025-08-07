package exercicios.exe04.test;

import exercicios.exe04.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto("Esmalte", 6.99, 5);

        produto.adicionarEstoque(3);
        produto.removerEstoque(1);
        produto.valorTotalEmEstoque();

    }
}
