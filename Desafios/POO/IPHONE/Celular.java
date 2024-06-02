import IPHONE.AparelhoTelefonico;
import IPHONE.NavegadorInternet;
import IPHONE.ReprodutorMusical;
import java.util.Random;
public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    String[] musicas = {"Bohemian Rhapsody - Queen", "Hotel California - Eagles", "Stairway to Heaven - Led Zeppelin"
            , "Imagine - John Lennon", "Smells Like Teen Spirit - Nirvana"};

    // Implementação dos métodos das interfaces
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando Música...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número :" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
        System.out.println("Desligadno chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correiro de voz");
        System.out.println("encerrando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("f5 pressionado. atualizando página");
    }
    public static void main(String[] args) {
        Celular iphone1 = new Celular();
        iphone1.selecionarMusica(iphone1.musicas[new Random().nextInt(iphone1.musicas.length)]);
        iphone1.tocar();
        iphone1.pausar();
        iphone1.ligar("22998715889");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        iphone1.exibirPagina("www.youtube.com");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();
    }
}