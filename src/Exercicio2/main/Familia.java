package Exercicio2.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Familia<T extends MembroFamilia> {
    private Set<T> membros;

    public Familia() {
        this.membros = new HashSet<>();
    }

    public List<T> getMembros() {
        return this.membros.stream().toList();
    }

    public void adicionarMembro(T membro) {
        this.membros.add(membro);
    }

    public void removerMembro(T membro) {
        this.membros.remove(membro);
    }
}
