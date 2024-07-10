package Exercicio4.main;

import Exercicio4.main.componentes.ComponenteRede;
import Exercicio4.main.redes.Rede;

import java.util.ArrayList;
import java.util.List;

public class SimuladorRede<T extends Rede, U extends ComponenteRede> {
    private T rede;
    private List<U> componentes;

    public SimuladorRede(T rede) {
        this.rede = rede;
        this.componentes = new ArrayList<>();
    }

    public void adicionarComponente(U componente) {
        this.componentes.add(componente);
    }

    public List<U> getComponentes() {
        return this.componentes;
    }

    public T getRede() {
        return rede;
    }

    public void setRede(T rede) {
        this.rede = rede;
    }

    public void simular() {
        this.componentes.forEach(componente -> this.rede.enviarDados(componente));
    }
}
