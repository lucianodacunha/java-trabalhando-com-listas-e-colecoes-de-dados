package io.github.lucianodacunha.screenmatch.aula04.model;


public class Audio implements Comparable<Audio>{
    private String titulo;
    private float duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private String classificacao = "";

    public Audio(String titulo, float duracao){

        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        System.out.printf("Curtiu o audio %s!", this.getTitulo());
        this.curtidas++;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void classificar(int classificacao) {
        System.out.printf("Classificou o audio %s!\n", this.getTitulo());

        StringBuilder stars = new StringBuilder();
        for(int i = 1; i <= classificacao; i++)
            stars.append("*");

        this.classificacao = stars.toString();
    }

    public void reproduzir(){
        System.out.printf("Reproduzindo o Audio...%s\n", this.getTitulo());
        this.totalDeReproducoes++;
    }


    @Override
    public String toString(){
        return String.format(
                """
                Titulo: %s
                Duração: %.2f
                Total de Reproduções: %d
                Curtida: %s
                Classificação: %s
                """,
                getTitulo(), getDuracao(), getTotalDeReproducoes(),
                getCurtidas(), getClassificacao()
        );
    }

    @Override
    public int compareTo(Audio outroAudio) {
        return this.getTitulo().compareTo(((Audio) outroAudio).getTitulo());
    }
}