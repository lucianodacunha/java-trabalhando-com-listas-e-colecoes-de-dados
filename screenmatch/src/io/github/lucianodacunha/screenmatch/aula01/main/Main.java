package io.github.lucianodacunha.screenmatch.aula01.main;

import io.github.lucianodacunha.screenmatch.aula01.model.Audio;
import io.github.lucianodacunha.screenmatch.aula01.model.Favoritavel;
import io.github.lucianodacunha.screenmatch.aula01.model.Musica;
import io.github.lucianodacunha.screenmatch.aula01.model.PodCast;
import io.github.lucianodacunha.screenmatch.cursoanteiror.aula01.Filme;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Como representar listas de objetos no Java, com a utilização da classe
 * ArrayList;
 * A manipular um ArrayList com seus métodos add, size e get;
 * Os diferentes tipos de classes do Java para representar uma lista;
 * Como funciona o método toString(), utilizado para representar um objeto em
 * texto.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Musica perdida = new Musica();
        perdida.setCantor("Biig Piig");
        perdida.setAlbum("Vol. I - Big fan of the sesh");
        perdida.setTitulo("Perdida");
        perdida.setDuracao(3.01f);
        perdida.reproduzir();
        perdida.classificar(4);
        perdida.curtir();
        perdida.favoritar();

        Musica rosesAndGold = new Musica();
        perdida.setCantor("Biig Piig");
        perdida.setAlbum("Vol. I - Big fan of the sesh");
        rosesAndGold.setTitulo("Roses and Gold");
        rosesAndGold.setDuracao(3.15f);
        rosesAndGold.reproduzir();
        rosesAndGold.reproduzir();
        rosesAndGold.reproduzir();
        rosesAndGold.classificar(4);

        PodCast primoDev13 = new PodCast();
        primoDev13.setHost("PrimoDev");
        primoDev13.setTitulo("Quais habilidades um desenvolvedor precisa ter?");
        primoDev13.setDuracao(7.55f);
        primoDev13.reproduzir();
        primoDev13.reproduzir();
        primoDev13.classificar(5);
        primoDev13.favoritar();

        /**
         * A partir do Java 10, foi adicionada uma nova funcionalidade para a
         * declaração de variáveis chamada var.
         */
        var filmeSpider = new Filme();
        filmeSpider.setTitulo("Homem Aranha");
        filmeSpider.setAnoDeLancamento(2005);
        filmeSpider.setEstaIncluidoNoPlano(true);

        Favoritavel[] favoritos = {perdida, rosesAndGold, primoDev13};

        ArrayList<Audio> listaDeMusicas = new ArrayList<>();
        listaDeMusicas.add(primoDev13);
        listaDeMusicas.add(rosesAndGold);
        listaDeMusicas.add(perdida);
        

        for(Audio audio : listaDeMusicas){
            System.out.println(audio);
        }

    }
}



