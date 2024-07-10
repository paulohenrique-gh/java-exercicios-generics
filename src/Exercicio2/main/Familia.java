package Exercicio2.main;

import java.util.ArrayList;
import java.util.List;

public class Familia<T extends MembroFamilia> {
    private List<T> membros;

    public Familia() {
        this.membros = new ArrayList<>();
    }

    public List<T> getMembros() {
        return this.membros;
    }

    public void adicionarMembro(T membro) {
        this.membros.add(membro);
    }

    public void removerMembro(T membro) {
        this.membros.remove(membro);
    }
}
