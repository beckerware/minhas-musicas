import java.util.Random;

import br.com.javaalura.Audios.Musica;
import br.com.javaalura.Audios.Podcast;
import br.com.javaalura.Audios.Preferencias;

public class App {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        Preferencias favoritos = new Preferencias();

        Musica musica1 = new Musica();
        Musica musica2 = new Musica();
        Musica musica3 = new Musica();
        Musica musica4 = new Musica();
        Musica musica5 = new Musica();
        Musica musica6 = new Musica();
        Musica musica7 = new Musica();
        Musica musica8 = new Musica();
        Musica musica9 = new Musica();

        musica1.setTitulo("Circle With Me");
        musica1.setCantor("Spiritbox");
        musica1.setAlbum("Eternal Blue");
        musica1.setDuracao("3:54");
        musica2.setTitulo("Overcompensate");
        musica2.setCantor("Twenty One Pilots");
        musica2.setAlbum("Clancy");
        musica2.setDuracao("3:56");
        musica3.setTitulo("Rule Of Nines");
        musica3.setCantor("Spiritbox");
        musica3.setAlbum("Rule Of Nines");
        musica3.setDuracao("3:31");
        musica4.setTitulo("Next Semester");
        musica4.setCantor("Twenty One Pilots");
        musica4.setAlbum("Clancy");
        musica4.setDuracao("3:54");
        musica5.setTitulo("Shadow Moses");
        musica5.setCantor("Bring Me The Horizon");
        musica5.setAlbum("Sempiternal");
        musica5.setDuracao("4:03");

        int reproducoes = gerador.nextInt(10000);
        for (int j = 0; j < reproducoes; j++) {
            musica1.reproduzir();
        }
        reproducoes = gerador.nextInt(10000);
        for (int j = 0; j < reproducoes; j++) {
            musica2.reproduzir();
        }
        reproducoes = gerador.nextInt(10000);
        for (int j = 0; j < reproducoes; j++) {
            musica3.reproduzir();
        }
        reproducoes = gerador.nextInt(10000);
        for (int j = 0; j < reproducoes; j++) {
            musica4.reproduzir();
        }
        reproducoes = gerador.nextInt(10000);
        for (int j = 0; j < reproducoes; j++) {
            musica5.reproduzir();
        }

        System.out.println(musica1.getReproducoes());
        System.out.println(musica2.getReproducoes());
        System.out.println(musica3.getReproducoes());
        System.out.println(musica4.getReproducoes());
        System.out.println(musica5.getReproducoes());

        musica1.imprimirFicha();
        favoritos.inclui(musica1);

        musica2.imprimirFicha();
        favoritos.inclui(musica2);

        musica3.imprimirFicha();
        favoritos.inclui(musica3);

        musica4.imprimirFicha();
        favoritos.inclui(musica4);

        musica5.imprimirFicha();
        favoritos.inclui(musica5);

        Podcast pod1 = new Podcast();
        Podcast pod2 = new Podcast();
        Podcast pod3 = new Podcast();
        Podcast pod4 = new Podcast();
        Podcast pod5 = new Podcast();

        pod1.setTitulo("Nerdcast");
        pod1.setApresentador("Jovem Nerd");
        pod1.setDescricao("O mundo vira piada no Jovem Nerd");
        pod2.setTitulo("Critical Role");
        pod2.setApresentador("Matthew Mercer");
        pod2.setDescricao("Home of a bunch of nerdy voice actors playing roleplaying games!");
        pod3.setTitulo("Modus Operandi");
        pod3.setApresentador("Carol Morerira e Mabê");
        pod3.setDescricao("Podcast de True Crime");
        pod4.setTitulo("The Magnus Archives");
        pod4.setApresentador("Rusty Quill");
        pod4.setDescricao(
                "A weekly horror fiction podcast examining what lurks in the archives of the Magnus Institute.");
        pod5.setTitulo("Lore");
        pod5.setApresentador("Aaron Mahnke");
        pod5.setDescricao("The award-winning podcast about dark historical tales.");

        int curtidas = gerador.nextInt(1000);
        for (int i = 0; i < curtidas; i++) {
            pod1.curtir();
        }
        curtidas = gerador.nextInt(1000);
        for (int i = 0; i < curtidas; i++) {
            pod2.curtir();
        }
        curtidas = gerador.nextInt(1000);
        for (int i = 0; i < curtidas; i++) {
            pod3.curtir();
        }
        curtidas = gerador.nextInt(1000);
        for (int i = 0; i < curtidas; i++) {
            pod4.curtir();
        }
        curtidas = gerador.nextInt(1000);
        for (int i = 0; i < curtidas; i++) {
            pod5.curtir();
        }

        pod1.imprimirFicha();
        favoritos.inclui(pod1);
        pod2.imprimirFicha();
        favoritos.inclui(pod2);
        pod3.imprimirFicha();
        favoritos.inclui(pod3);
        pod4.imprimirFicha();
        favoritos.inclui(pod4);
        pod5.imprimirFicha();
        favoritos.inclui(pod5);
    }
}