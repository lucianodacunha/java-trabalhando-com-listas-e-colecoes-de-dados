package io.github.lucianodacunha.screenmatch.aula03.main;

import io.github.lucianodacunha.screenmatch.aula03.model.Audio;
import io.github.lucianodacunha.screenmatch.aula03.model.Musica;
import io.github.lucianodacunha.screenmatch.aula03.model.PodCast;

import java.util.ArrayList;

/**
 * A percorrer um ArrayList com um loop foreach;
 * A realizar o casting de um objeto, convertendo-o para outro tipo compatível;
 * Como verificar se um objeto é de um determinado tipo, com o uso da palavra
 * reservada instanceof.
 */
public class Main {
    public static void main(String[] args) {
        var musica1 = new Musica("Musica1", 2.20f);
        var musica2 = new Musica("Musica2", 4.00f);
        var musica3 = new Musica("Musica3", 3.10f);
        var podcast1 = new PodCast("Podcast1", 30.10f, "Host1");
        var podcast2 = new PodCast("Podcast2", 40.11f, "Host2");

        var lista = new ArrayList<Audio>();
        lista.add(musica1);
        lista.add(musica2);
        lista.add(musica3);
        lista.add(podcast1);
        lista.add(podcast2);

        for(Audio a : lista){
            if (a instanceof PodCast){
                System.out.println("Podcast: \n" + a);
            } else {
                System.out.println("Musica: \n" + a);
            }
        }
    }
}




