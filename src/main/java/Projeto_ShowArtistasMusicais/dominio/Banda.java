package Projeto_ShowArtistasMusicais.dominio;

import Projeto_ShowArtistasMusicais.repository.Contratavel;

public class Banda extends Artista implements Contratavel {
    private int numIntegrantes;

    public Banda(String nome, String genero, int publicoEsperado, boolean dataEspecial, int tempoShow, String data, int numIntegrantes) {
        super(nome, genero, publicoEsperado, dataEspecial, tempoShow, data);
        this.numIntegrantes = numIntegrantes;
    }

    @Override
    public double calcularCache() {
        double base = 2800.50;
        double adicionalIntegrantes  = numIntegrantes * 150;
        double duracao =  ( (double) tempoShow / 60) * 700;
        double lotacao = publicoEsperado > 3000 ? 1500 : 0;
        double holiday = dataEspecial ? base * 0.5 : 0;
        return base + duracao + adicionalIntegrantes + lotacao + holiday;
    }


    @Override
    public String gerarContrato() {
        return "==Contrato de prestação de serviço artístico==\n A organização Coachella contrata a banda " + nome + ", para apresentação em " + data + ", com duração de  " + tempoShow + " minutos." ;
    }
}
