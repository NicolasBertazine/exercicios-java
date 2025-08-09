package exercicios.exe10.dominio;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalarioTotal() {
        setSalario(getBonus() + getSalario());
        System.out.println("Nome do Gerente " + getNome());
        System.out.println("Salario: " + getSalario());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
