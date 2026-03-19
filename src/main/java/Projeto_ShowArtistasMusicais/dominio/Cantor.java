package Projeto_ShowArtistasMusicais.dominio;

import Projeto_ShowArtistasMusicais.repository.Contratavel;

public class Cantor extends Artista implements Contratavel {

    public Cantor(String nome, String genero, int publicoEsperado, boolean dataEspecial, int tempoShow,String data) {
        super(nome, genero, publicoEsperado, dataEspecial, tempoShow, data);
    }

    @Override
    public double calcularCache() {
        double base = 2500.50;
        double duracao =  ( (double) tempoShow / 60) * 700;
        double lotacao = publicoEsperado > 3000 ? 1500 : 0;
        double holiday = dataEspecial ? base * 0.5 : 0;
        return base + duracao + lotacao + holiday;
    }

    @Override
    public String gerarContrato() {
        return "Contrato de prestação de serviço artístico: a organização Coachella contrata o Cantor " + nome + ", para apresentação em " + data + ", com duração de" + tempoShow + " minutos." ;
    }
}
