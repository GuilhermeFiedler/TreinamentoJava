package Projeto_ShowArtistasMusicais.service;

import Projeto_ShowArtistasMusicais.dominio.Artista;

public class GeradorRelatorioCache {

    public static void calcularCache(Artista artista) {
        System.out.println("Relatório de cachê:");
        double cache = artista.calcularCache();
        System.out.printf("Valor total do cachê: R$ %.2f%n", cache);

    }
}
