package org.example;

public class Main {
    public static void testDispositivo(Dispositivo dispositivo){
        System.out.println("Testes com dispositivos e atrações.");
        BelleEpoque belleEpoque = new BelleEpoque(dispositivo);
        belleEpoque.iniciar();
        belleEpoque.toggleLegenda();
        belleEpoque.statusAtracao();

        AntigoEgito antigoEgito = new AntigoEgito(dispositivo);
        antigoEgito.iniciar();
        antigoEgito.statusAtracao();
        antigoEgito.toggleLegenda();
        antigoEgito.togglePausa();
        antigoEgito.statusAtracao();
    }
    public static void main(String[] args) {
        testDispositivo(new Televisor());
        testDispositivo(new OculosVR());
    }
}