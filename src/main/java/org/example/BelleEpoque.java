package org.example;

public class BelleEpoque implements Atracao {
    protected Dispositivo dispositivo;

    public BelleEpoque(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    private String nome = "Belle Epoque";
    private String duracao = "1h 30m";
    private String anoSimul = "1893";
    private String descricao = "A Belle Époque (expressão francesa que significa \"Bela Época\" foi um período cultural da história da Europa correspondente à paz e prosperidade, vivenciadas principalmente na França entre os anos 1871 e 1914, terminando com o começo da Primeira Guerra Mundial.";

    @Override
    public void iniciar() {
        if (dispositivo.isOn()) {
            dispositivo.turnOff();
            System.out.println("A atração " + nome + " foi encerrada.");
        } else {
            dispositivo.turnOn();
            System.out.println("A atração " + nome + " foi iniciada.");
        }
    }

    @Override
    public void togglePausa() {
        if (dispositivo.isPaused()) {
            dispositivo.unpause();
            System.out.println("A atração " + nome + " foi despausada.");

        } else {
            dispositivo.pause();
            System.out.println("A atração " + nome + " foi pausada.");
        }
    }

    @Override
    public void toggleLegenda() {
        if (dispositivo.isSubbed()) {
            dispositivo.subsOff();
            System.out.println("Legendas desligadas.");
        } else {
            dispositivo.subsOn();
            System.out.println("Legendas ligadas.");
        }
    }

    @Override
    public void statusAtracao() {
        System.out.println("-----------------------------------------------------");
        System.out.println("A atração " + nome + " está com a tela " + (dispositivo.isOn() ? "ligada" : "desligada") + ", " + (dispositivo.isPaused() ? "em pausa" : "a reproduzir") + " e " + (dispositivo.isSubbed() ? "com legendas" : "sem legendas") + ".");
        System.out.println("Nome: " + nome);
        System.out.println("Duração: " + duracao);
        System.out.println("Data da simulação: " + anoSimul);
        System.out.println("Descrição: " + descricao);
        System.out.println("-----------------------------------------------------");
    }
}
