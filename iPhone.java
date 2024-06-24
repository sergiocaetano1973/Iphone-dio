import java.util.List;

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

abstract class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Pode conter implementações comuns ou atributos compartilhados entre as interfaces
}

class ImplementacaoiPhone extends iPhone {
    private List<String> playlist;
    private String numeroDiscado;

    @Override
    public void tocar() {
        // Implementação de tocar música
    }

    @Override
    public void pausar() {
        // Implementação de pausar música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação de selecionar música
    }

    @Override
    public void ligar(String numero) {
        // Implementação de ligar para um número
    }

    @Override
    public void atender() {
        // Implementação de atender chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação de iniciar correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação de exibir página web
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação de adicionar nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        // Implementação de atualizar página web
    }
}
