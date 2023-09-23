package io.github.lucianodacunha.screenmatch.aula02.main;

import io.github.lucianodacunha.screenmatch.aula02.model.Audio;
import io.github.lucianodacunha.screenmatch.aula02.model.Favoritavel;
import io.github.lucianodacunha.screenmatch.aula02.model.Musica;
import io.github.lucianodacunha.screenmatch.aula02.model.PodCast;
import io.github.lucianodacunha.screenmatch.cursoanteiror.aula01.Filme;

import java.util.ArrayList;
import java.util.Locale;

/**
 * A passar parâmetros ao instanciar objetos, com a utilização de construtores;
 * Como funciona o construtor default (padrão) no Java;
 * Como declarar construtores em uma classe;
 *A chamar o construtor da classe mãe, com a palavra reservada super.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Musica perdida = new Musica("Biig Piig", 3.01f);
        perdida.setAlbum("Vol. I - Big fan of the sesh");
        perdida.setTitulo("Perdida");
        perdida.reproduzir();
        perdida.classificar(4);
        perdida.curtir();
        perdida.favoritar();

        Musica rosesAndGold = new Musica("Roses and Gold", 3.15f);
        perdida.setCantor("Biig Piig");
        perdida.setAlbum("Vol. I - Big fan of the sesh");
        rosesAndGold.reproduzir();
        rosesAndGold.reproduzir();
        rosesAndGold.reproduzir();
        rosesAndGold.classificar(4);

        PodCast primoDev13 = new PodCast("Quais habilidades um desenvolvedor precisa ter?", 7.55f,"PrimoDev");
        primoDev13.reproduzir();
        primoDev13.reproduzir();
        primoDev13.classificar(5);
        primoDev13.favoritar();

        /**
         * A partir do Java 10, foi adicionada uma nova funcionalidade para a
         * declaração de variáveis chamada var.
         */
        var musica = new Musica("Sweet Child O'Mine", 5.57f);
        musica.setCantor("Guns N' Roses");
        musica.setAlbum("Apetite for Destruction");
        musica.favoritar();

        Favoritavel[] favoritos = {perdida, rosesAndGold, primoDev13, musica};

        ArrayList<Audio> listaDeMusicas = new ArrayList<>();
        listaDeMusicas.add(primoDev13);
        listaDeMusicas.add(rosesAndGold);
        listaDeMusicas.add(perdida);
        listaDeMusicas.add(musica);

        System.out.println("");

        for(Audio audio : listaDeMusicas){
            System.out.println(audio);
        }

    }
}



