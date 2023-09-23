package io.github.lucianodacunha.screenmatch.aula04.main;

import io.github.lucianodacunha.screenmatch.aula04.model.Audio;
import io.github.lucianodacunha.screenmatch.aula04.model.Musica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Como ordenar uma lista no Java, via método Collections.sort;
 * Que para ordenar objetos que são de classes do nosso projeto, com a classe
 * Titulo, devemos implementar nela a interface Comparable;
 * Como implementar corretamente o método compareTo, da interface Comparable,
 * para que o Java faça a ordenação correta dos elementos de uma lista;
 * Que podemos flexibilizar a ordenação de uma lista, via método sort da própria
 * interface List, passando como parâmetro um critério de ordenação;
 * Que a classe ArrayList implementa a interface List, sendo que essa interface
 * possui outras implementações, como a classe LinkedList;
 * Que podemos declarar a variável de uma lista utilizando a interface List,
 * ganhando com isso o polimorfismo com a flexibilidade de trocar facilmente a
 * implementação sendo instanciada.
 */
public class Main {
    public static void main(String[] args) {
        var musica1 = new Musica("Every Br0eath You Take", 4.14f);
        var musica2 = new Musica("I Love Rock 'N Roll", 4.00f);
        var musica3 = new Musica("You Give Love a Bad Name", 3.10f);
        var musica4 = new Musica("Wanted Dead or Alive", 30.10f);
        var musica5 = new Musica("Radio Ga Ga", 40.11f);

        List<Audio> lista = new ArrayList<Audio>();
        lista.add(musica1);
        lista.add(musica2);
        lista.add(musica3);
        lista.add(musica4);
        lista.add(musica5);

        System.out.println("------------------------------------");
        // ordenando por titulo.
        // comparable já foi implementado com o titulo.
        Collections.sort(lista);

        System.out.println(lista);

        System.out.println("------------------------------------");
        // ordenando por duração.
        //
        lista.sort(Comparator.comparing(Audio::getDuracao));
        System.out.println(lista);
        System.out.println("------------------------------------");
    }
}




