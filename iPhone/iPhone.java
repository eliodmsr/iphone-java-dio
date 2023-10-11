package iPhone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String nome;

    public iPhone(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando m�sica...");
    }

    @Override
    public void pausar() {
        System.out.println("M�sica pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("M�sica selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo p�gina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando p�gina...");
    }
}
