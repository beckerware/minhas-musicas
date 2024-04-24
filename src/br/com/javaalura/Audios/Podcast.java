package br.com.javaalura.Audios;

public class Podcast extends Audio{

    private String apresentador;
    private String descricao;


    public String getApresentador() {
        return this.apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public double getClassificacao(){
        if(this.getCurtidas() >= 500){
            return 10;
        }else{
            return 7;
        }
    }

    @Override
    public void imprimirFicha(){
        System.out.println("Nome: " + this.getTitulo());
        System.out.println("Apresentador: " + this.getApresentador());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Curtidas: " + this.getCurtidas());
    }
}
