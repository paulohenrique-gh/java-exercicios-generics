package Exercicio4.main;

import Exercicio4.main.componentes.Celular;
import Exercicio4.main.componentes.ComponenteRede;
import Exercicio4.main.componentes.Computador;
import Exercicio4.main.componentes.SmartTv;
import Exercicio4.main.redes.RedeLocal;
import Exercicio4.main.redes.RedeWAN;
import Exercicio4.main.redes.RedeWiFi;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular("Meu Samsung");
        Computador computador = new Computador("Computador do quarto");
        SmartTv smartTv = new SmartTv("TV da sala");

        SimuladorRede<RedeLocal, ComponenteRede> simuladorRedeLocal = new SimuladorRede<>(new RedeLocal());
        simuladorRedeLocal.adicionarComponente(computador);
        simuladorRedeLocal.adicionarComponente(smartTv);
        simuladorRedeLocal.simular();

        SimuladorRede<RedeWiFi, ComponenteRede> simuladorWiFi = new SimuladorRede<>(new RedeWiFi());
        simuladorWiFi.adicionarComponente(celular);
        simuladorWiFi.adicionarComponente(computador);
        simuladorWiFi.adicionarComponente(smartTv);
        simuladorWiFi.simular();

        SimuladorRede<RedeWAN, ComponenteRede> simuladorWan = new SimuladorRede<>(new RedeWAN());
        simuladorWan.adicionarComponente(computador);
        simuladorWan.adicionarComponente(smartTv);
        simuladorWan.simular();
    }
}
