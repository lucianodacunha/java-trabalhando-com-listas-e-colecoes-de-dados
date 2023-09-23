package io.github.lucianodacunha.screenmatch.cursoanteiror.aula03.main;

import io.github.lucianodacunha.screenmatch.cursoanteiror.aula03.model.Filme;
import io.github.lucianodacunha.screenmatch.cursoanteiror.aula03.model.Serie;
import io.github.lucianodacunha.screenmatch.cursoanteiror.aula03.util.CalculadoraDeTempo;

/**
 * O problema de ter códigos duplicados em várias classes, utilizando a herança
 * como solução;
 * A palavra-chave extends, utilizada para indicar que uma classe herda de
 * outra;
 * Como sobrescrever um método sendo herdado, com o uso opcional da anotação
 * @Override;
 * Como aplicar o conceito de polimorfismo no código, evitando métodos
 * duplicados.
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
        // -------------------------------------
        CalculadoraDeTempo cdt = new CalculadoraDeTempo();
        cdt.adiciona(ff);
        cdt.adiciona(bb);
        System.out.println("Tempo total: " + cdt.getTempoTotal() + " minutos.");
    }
}
