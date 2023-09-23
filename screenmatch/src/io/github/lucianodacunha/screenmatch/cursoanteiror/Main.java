package io.github.lucianodacunha.screenmatch.cursoanteiror.aula01;

/**
 * O que é uma classe, sua estrutura, como criar e por que isso é um conceito
 * fundamental na orientação a objetos;
 * O que são atributos: as "características" de um objeto, e a definir e
 * visualizar esses valores;
 * A instanciar objetos;
 * Sobre os métodos (ou comportamentos) de um objeto;
 * A pensar nas entidades do mundo real em forma de objetos, que possuem
 * características (atributos) e comportamentos ou ações (métodos).
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
