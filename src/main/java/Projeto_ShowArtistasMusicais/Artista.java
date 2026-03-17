package Projeto_ShowArtistasMusicais;

public abstract class Artista {
    protected String nome;
    protected String genero;
    protected int publicoEsperado;
    protected boolean dataEspecial;
    protected int tempoShow;
    protected String data;

    public Artista(String nome, String genero, int publicoEsperado, boolean dataEspecial, int tempoShow, String data) {
        this.nome = nome;
        this.genero = genero;
        this.publicoEsperado = publicoEsperado;
        this.dataEspecial = dataEspecial;
        this.tempoShow = tempoShow;
        this.data = data;
    }

    public abstract String gerarContrato();
    public abstract double calcularCache();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPublicoEsperado() {
        return publicoEsperado;
    }

    public void setPublicoEsperado(int publicoEsperado) {
        this.publicoEsperado = publicoEsperado;
    }

    public boolean isDataEspecial() {
        return dataEspecial;
    }

    public void setDataEspecial(boolean dataEspecial) {
        this.dataEspecial = dataEspecial;
    }

    public int getTempoShow() {
        return tempoShow;
    }

    public void setTempoShow(int tempoShow) {
        this.tempoShow = tempoShow;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
