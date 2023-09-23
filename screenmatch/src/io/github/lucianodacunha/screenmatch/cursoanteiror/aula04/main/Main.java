package io.github.lucianodacunha.screenmatch.cursoanteiror.aula04.main;

import io.github.lucianodacunha.screenmatch.cursoanteiror.aula04.model.Filme;
import io.github.lucianodacunha.screenmatch.cursoanteiror.aula04.model.Serie;
import io.github.lucianodacunha.screenmatch.cursoanteiror.aula04.util.CalculadoraDeTempo;
import io.github.lucianodacunha.screenmatch.cursoanteiror.aula04.util.FiltraFavoritos;

/**
 * No Java uma classe pode herdar de somente uma única classe;
 * O conceito de interfaces no Java;
 * Que numa interface todos os métodos são públicos, não sendo então necessário
 * utilizar a palavra reservada public na declaração deles;
 * Que também é possível aplicar o polimorfismo com o uso de interfaces, similar
 * ao que foi demonstrado com a utilização da herança em aulas anteriores.
 */
public class Main {
    public static void main(String[] args) {
        Filme ff = new Filme();
        ff.setTitulo("Gravidade");
        ff.setDuracaoEmMinutos(91);
        ff.setAnoDeLancamento(2013);
        ff.setEstaIncluidoNoPlano(true);
        ff.exibeFichaTecnica();
        ff.avalia(8);
        ff.avalia(9);
        ff.exibeFichaTecnica();
        // -------------------------------------
        Serie bb = new Serie();
        bb.setTitulo("Breaking Bad");
        bb.setDuracaoEmMinutos(40);
        bb.setEpisodiosPorTemporada(5);
        bb.setAnoDeLancamento(2007);
        bb.setTemporadas(5);
        bb.setEstaIncluidoNoPlano(true);
        bb.avalia(10);
        bb.avalia(9);
        bb.exibeFichaTecnica();
        bb.favoritar();
        // -------------------------------------
        CalculadoraDeTempo cdt = new CalculadoraDeTempo();
        cdt.adiciona(ff);
        cdt.adiciona(bb);
        System.out.println("Tempo total: " + cdt.getTempoTotal() + " minutos.");
        // -------------------------------------
        FiltraFavoritos filtra = new FiltraFavoritos();
        filtra.filtraFavoritos(bb);
        filtra.filtraFavoritos(ff);
    }
}
