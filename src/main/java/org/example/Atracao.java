package org.example;

public interface Atracao {
    String nome = null;
    String duracao = null;
    int anoSimul = 0;
    String descricao = null;

    void iniciar();
    void togglePausa();

    void toggleLegenda();

    void statusAtracao();

}
