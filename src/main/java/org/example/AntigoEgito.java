package org.example;

public class AntigoEgito implements Atracao {
    protected Dispositivo dispositivo;

    public AntigoEgito(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    private String nome = "Egito Antigo";
    private String duracao = "1h 45m";
    private String anoSimul = "Aprox. 2500 a.C.";
    private String descricao = "O Antigo Egito foi uma civilização da Antiguidade Oriental do Norte de África, concentrada ao longo ao curso inferior do rio Nilo, no que é hoje o país moderno do Egito. Foi estabelecida no período pré-dinástico do Neolítico e c. 3150 a.C., e continuou a existir até à anexação romana em 30 a.C.";

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
