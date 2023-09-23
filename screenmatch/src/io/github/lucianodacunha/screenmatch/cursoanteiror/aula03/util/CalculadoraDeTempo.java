package io.github.lucianodacunha.screenmatch.cursoanteiror.aula03.util;

import io.github.lucianodacunha.screenmatch.cursoanteiror.aula03.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
    public void adiciona(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal(){
        return  this.tempoTotal;
    }
}
