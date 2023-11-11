package org.example;

public class Televisor implements Dispositivo {
    private boolean on = false;
    private boolean paused = false;
    private boolean subs = false;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean isPaused() {
        return paused;
    }

    @Override
    public void pause() {
        paused = true;
    }

    @Override
    public void unpause() {
        paused = false;
    }

    @Override
    public boolean isSubbed() {
        return subs;
    }

    @Override
    public void subsOn() {
        subs = true;
    }

    @Override
    public void subsOff() {
        subs = false;
    }

    @Override
    public void statusDispositivo() {
        System.out.println("O televisor encontra-se " + (on ? "ligado" : "desligado") + ", " + (paused ? "em pausa" : "a reproduzir") + " e " + (subs ? "com legendas" : "sem legendas") + ".");
    }
}
