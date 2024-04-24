package br.com.javaalura.Audios;

public class Musica extends Audio{
    private String cantor;
    private String album;

    public String getCantor() {
        return this.cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public double getClassificacao(){
        if(this.getReproducoes() >= 2000){
            return 10;
        }else{
            return 8;
        }
    }

    @Override
    public void imprimirFicha(){
        System.out.println("--------------------------------------------------");
        System.out.println("Nome: " + this.getTitulo());
        System.out.println("Artista: " + this.getCantor());
        System.out.println("Álbum: " + this.getAlbum());
        System.out.println("Duração: " + this.getDuracao());
        System.out.println("Reproduções: " + this.getReproducoes());
        System.out.println("Classificação: " + this.getClassificacao());
    }  
}
