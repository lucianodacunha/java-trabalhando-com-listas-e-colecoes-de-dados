package io.github.lucianodacunha.screenmatch.cursoanteiror.aula01;

public class Filme {
    private String titulo;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean estaIncluidoNoPlano;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.printf("""
                Título: %s
                Ano de Lançamento: %s
                Duração em Minutos: %d
                Incluído no Plano: %s
                Total de Avaliações: %d
                Média das Avaliações: %.2f\n
                """, getTitulo(), getAnoDeLancamento(), getDuracaoEmMinutos(),
                isEstaIncluidoNoPlano(), totalDeAvaliacoes, exibeAMedia());
    }

    public double exibeAMedia(){
        if (somaDasAvaliacoes > 0 && getTotalDeAvaliacoes() > 0)
            return this.somaDasAvaliacoes / getTotalDeAvaliacoes();
        return 0.0;
    }

    public void avalia(int nota){
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isEstaIncluidoNoPlano(){
        return estaIncluidoNoPlano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setEstaIncluidoNoPlano(boolean estaIncluidoNoPlano) {
        this.estaIncluidoNoPlano = estaIncluidoNoPlano;
    }
}
