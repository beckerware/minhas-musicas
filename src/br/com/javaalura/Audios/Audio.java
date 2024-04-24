/* A ideia é modelar de maneira que exista uma classe "Áudio" com título, duração, total de reproduções, curtidas e classificação, além de métodos encapsulados para curtir, reproduzir e assim por diante, impedindo que a classe Principal tenha acesso a esses atributos. */

package br.com.javaalura.Audios;

public class Audio {
    private String titulo;
    private String duracao;
    private int reproducoes;
    private int curtidas = 0;
    private double classificacao;

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.reproducoes++;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getReproducoes() {
        return this.reproducoes;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public double getClassificacao() {
        return this.classificacao;
    }

    public void imprimirFicha(){
        
    }
}
