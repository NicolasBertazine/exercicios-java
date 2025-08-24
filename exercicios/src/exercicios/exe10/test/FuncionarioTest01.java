package exercicios.exe10.test;

import exercicios.exe10.dominio.Funcionario;
import exercicios.exe10.dominio.Gerente;
import exercicios.exe10.dominio.Programador;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro", 4000);
        Gerente gerente = new Gerente("Kakashi", 6000, 300);
        Programador programador = new Programador("Nícolas", 3500, "Java");

        funcionario.calcularSalarioTotal();
        gerente.calcularSalarioTotal();
        programador.calcularSalarioTotal();
    }
}
