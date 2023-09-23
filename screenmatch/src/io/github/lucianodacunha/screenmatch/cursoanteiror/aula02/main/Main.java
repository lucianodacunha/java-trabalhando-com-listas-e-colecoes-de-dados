package io.github.lucianodacunha.screenmatch.cursoanteiror.aula02.main;

import io.github.lucianodacunha.screenmatch.cursoanteiror.aula02.model.Filme;

/**
 * Encapsulamento: controlar o acesso aos atributos e métodos de uma classe;
 * O que são os modificadores de acesso public e private;
 * Métodos de leitura dos atributos, que são os métodos getters;
 * Métodos de modificação dos atributos, que são os métodos setters;
 * O uso da palavra chave import, para importar classes de outros pacotes;
 * O uso da palavra chave this;
 * Boas práticas de dividir o código em pacotes, bem como a convenção usada:
 * domínio da empresa ao contrário, onde aqui vamos colocar por exemplo
 * br.com.alura.screenmatch.
 */
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setTitulo("Gravidade");
        meuFilme.setDuracaoEmMinutos(91);
        meuFilme.setAnoDeLancamento(2013);
        meuFilme.setEstaIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(9);

        meuFilme.exibeFichaTecnica();
    }
}
