package Exercicio4.test;

import Exercicio4.main.SimuladorRede;
import Exercicio4.main.componentes.Celular;
import Exercicio4.main.componentes.ComponenteRede;
import Exercicio4.main.componentes.Computador;
import Exercicio4.main.componentes.SmartTv;
import Exercicio4.main.redes.RedeLocal;
import Exercicio4.main.redes.RedeWiFi;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SimuladorRedeTest {
    @Test
    void devePermitirAdicionarComponente() {
        SimuladorRede<RedeLocal, ComponenteRede> simulador = new SimuladorRede<>(new RedeLocal());
        Celular celularSamsung = new Celular("Samsung");
        simulador.adicionarComponente(celularSamsung);

        assertTrue(simulador.getComponentes().contains(celularSamsung));
    }

    @Test
    // https://www.baeldung.com/java-testing-system-out-println
    // https://stackoverflow.com/a/23095198/22829483
    void deveSimularEnvioDeDadosParaComponentes() {
        PrintStream saidaPadrao = System.out;
        ByteArrayOutputStream saidaStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaStream));

        SimuladorRede<RedeWiFi, ComponenteRede> simulador = new SimuladorRede<>(new RedeWiFi());
        Celular celular = new Celular("Samsung");
        Computador computador = new Computador("Dell");
        SmartTv smartTv = new SmartTv("Sony");
        simulador.adicionarComponente(celular);
        simulador.adicionarComponente(computador);
        simulador.adicionarComponente(smartTv);

        String saidaEsperada = "Enviando dados via rede sem fio para componente Samsung" +
                "\r\nEnviando dados via rede sem fio para componente Dell" +
                "\r\nEnviando dados via rede sem fio para componente Sony";
        simulador.simular();

        assertEquals(saidaEsperada, saidaStream.toString().trim());

        System.setOut(saidaPadrao);
    }

}