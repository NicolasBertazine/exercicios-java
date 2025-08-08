package exercicios.exe08.dominio;

public class Funcionario {
    private String nome;
    private double salaro;

    public void aumentarSalario(double percential) {
        salaro = getSalaro() + ((getSalaro() * percential) / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: R$" + getSalaro());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalaro() {
        return salaro;
    }

    public void setSalaro(double salaro) {
        this.salaro = salaro;
    }
}
