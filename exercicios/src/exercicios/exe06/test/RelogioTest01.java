package exercicios.exe06.test;

import exercicios.exe06.dominio.Relogio;

public class RelogioTest01 {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.coletarTempo();
        relogio.exibirHora();
        relogio.avancarUmSegundo();
        relogio.exibirHora();
        relogio.avancarUmSegundo();
        relogio.exibirHora();
    }
}
