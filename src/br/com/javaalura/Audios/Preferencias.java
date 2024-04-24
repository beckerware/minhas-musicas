package br.com.javaalura.Audios;

public class Preferencias {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9 ){
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto e um dos títulos preferidos da galera!");
        }else{
            System.out.println(audio.getTitulo() + " é um dos títulos que todo mundo está curtindo. Não deixe de ouvir também!");
        }
    }
}
