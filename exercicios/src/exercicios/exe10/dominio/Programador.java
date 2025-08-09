package exercicios.exe10.dominio;

public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void calcularSalarioTotal() {
        System.out.println("Nome do funcionario " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Linguagem: " + getLinguagem());
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
