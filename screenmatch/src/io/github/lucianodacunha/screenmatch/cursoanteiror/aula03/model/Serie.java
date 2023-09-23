package io.github.lucianodacunha.screenmatch.cursoanteiror.aula03.model;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * super.getDuracaoEmMinutos() * getEpisodiosPorTemporada() ;
    }

    public int getTemporadas(){
        return this.temporadas;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int quantidade){
        this.episodiosPorTemporada = quantidade;
    }

    public int getEpisodiosPorTemporada(){
        return this.episodiosPorTemporada;
    }

    @Override
    public void exibeFichaTecnica(){
        System.out.printf("""
                Título: %s
                Ano de Lançamento: %d
                Duração em Minutos: %d
                Incluído no Plano: %s
                Temporadas: %d
                Ativa: %s
                Total de Avaliações: %d
                Média das Avaliações: %.2f\n
                """, getTitulo(), getAnoDeLancamento(), getDuracaoEmMinutos(),
                isEstaIncluidoNoPlano(), getTemporadas(),
                isAtiva(), getQuantidadeDeAvaliacoes(), getMediaDasAvaliacoes()
                );
    }
}
