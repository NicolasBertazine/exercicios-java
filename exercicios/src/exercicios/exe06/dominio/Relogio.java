package exercicios.exe06.dominio;

import java.util.Scanner;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    Scanner scan = new Scanner(System.in);

    public void coletarTempo() {
        System.out.println("Qual a horas: ");
        hora = scan.nextInt();
        System.out.println("Quantos minutos: ");
        minuto = scan.nextInt();
        System.out.println("Quantos segundos: ");
        segundo = scan.nextInt();
    }

    public int avancarUmSegundo() {
        return segundo = this.segundo + 1;
    }

    public void exibirHora() {
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }
}
