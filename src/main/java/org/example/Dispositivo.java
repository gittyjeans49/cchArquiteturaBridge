package org.example;

public interface Dispositivo {
    boolean isOn();
    void turnOn();
    void turnOff();
    boolean isPaused();
    void pause();
    void unpause();
    boolean isSubbed();
    void subsOn();
    void subsOff();
    void statusDispositivo();
}
