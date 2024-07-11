package Exercicio5.main;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPersonagens<T extends Personagem> {
    List<T> personagens;

    public GerenciadorPersonagens(){
        this.personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(T personagem){
        this.personagens.add(personagem);
    }

    public void removerPersonagem(T personagem){
        this.personagens.remove(personagem);
    }

    public List<T> getPersonagens() {
        return this.personagens;
    }
}

