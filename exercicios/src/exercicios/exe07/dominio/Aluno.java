package exercicios.exe07.dominio;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double media() {
        double media = (getNota1() + getNota2()) / 2;
        return media;
    }

    public void foiAprovado() {
        media();
        if (media() > 6) {
            System.out.println("Com a média de "+ media()+" você foi APROVADO!");
        } else {
            System.out.println("Com a média de "+ media()+" você foi REPROVADO!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
