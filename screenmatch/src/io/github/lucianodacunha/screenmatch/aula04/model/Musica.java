package io.github.lucianodacunha.screenmatch.aula04.model;

public class Musica extends Audio implements Favoritavel {
    private String cantor;
    private String album;

    public Musica(String titulo, float duracao){
        super(titulo, duracao);
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private boolean favorito;

    @Override
    public void favoritar() {
        this.favorito = true;
    }

    @Override
    public boolean isFavorito() {
        return this.favorito;
    }

    @Override
    public String toString() {
        return String.format("""
                Cantor: %s
                Album: %s
                %s        
                """, getCantor(), getAlbum(), super.toString());
    }

}

