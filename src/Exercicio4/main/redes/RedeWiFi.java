package Exercicio4.main.redes;

import Exercicio4.main.componentes.ComponenteRede;

public class RedeWiFi implements Rede {
    @Override
    public void enviarDados(ComponenteRede componenteRede) {
        System.out.println("Enviando dados via rede sem fio para componente " + componenteRede.getNome());
    }
}
