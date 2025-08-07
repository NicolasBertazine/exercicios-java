package exercicios.exe01.test;

import exercicios.exe01.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nícolas");
        pessoa.setIdade(20);

        pessoa.exibirDados();
        pessoa.fazerAniversario();
        System.out.println("------------");
        pessoa.exibirDados();
    }
}
