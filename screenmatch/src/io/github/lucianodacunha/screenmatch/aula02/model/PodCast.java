package io.github.lucianodacunha.screenmatch.aula02.model;


public class PodCast extends Audio implements Favoritavel {
    private String host;

    private boolean favorito;

    public PodCast(String titulo, float duracao, String host){
        super(titulo, duracao);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    @Override
    public void favoritar() {
        this.favorito = true;
    }

    @Override
    public boolean isFavorito() {
        return this.favorito;
    }

    public String toString(){
        return String.format(
                """
                Host: %s
                %s
                """, getHost(), super.toString());
    }
}