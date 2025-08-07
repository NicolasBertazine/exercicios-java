package exercicios.exe07.test;

import exercicios.exe07.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Nícolas", 6, 7.5);

        aluno.media();
        aluno.foiAprovado();
    }
}
