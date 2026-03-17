package Projeto_ShowArtistasMusicais.service;

import Projeto_ShowArtistasMusicais.Artista;

public class EmitirContrato {
    public static void emissaoContrato(Artista artista) {
        System.out.println("Emitindo contrato de show...");
        String contrato = artista.gerarContrato();
        System.out.println(contrato);
    }
}
