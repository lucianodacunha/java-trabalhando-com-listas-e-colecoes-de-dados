package io.github.lucianodacunha.screenmatch.aula01.model;


public class PodCast extends Audio implements Favoritavel{
    private String host;

    private boolean favorito;

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