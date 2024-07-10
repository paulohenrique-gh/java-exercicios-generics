package Exercicio4.main.redes;

import Exercicio4.main.componentes.ComponenteRede;

public class RedeWAN implements Rede {
    @Override
    public void enviarDados(ComponenteRede componenteRede) {
        System.out.println("Enviando dados via rede WAN para componente " + componenteRede.getNome());
    }
}
