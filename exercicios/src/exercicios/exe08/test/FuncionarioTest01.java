package exercicios.exe08.test;

import exercicios.exe08.dominio.Funcionario;
import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome:");
        funcionario.setNome(scan.nextLine());

        System.out.println("Qual seu salário:");
        funcionario.setSalaro(scan.nextDouble());

        System.out.println("Recebeu um aumento de quantos porcento:");
        funcionario.aumentarSalario(scan.nextDouble());

        funcionario.exibirInformacoes();
    }
}
