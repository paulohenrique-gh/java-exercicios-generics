package main;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
    List<T> elementos;

    public Fila() {
        this.elementos = new ArrayList<T>();
    }

    public List<T> getElementos() {
        return this.elementos;
    }

    public void enfileirar(T elemento) {
        this.elementos.add(elemento);
    }

    public T desenfileirar() {
        return this.elementos.removeFirst();
    }

    public boolean isVazia() {
        return this.elementos.isEmpty();
    }
}
