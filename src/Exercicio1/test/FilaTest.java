package Exercicio1.test;

import Exercicio1.main.Fila;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest {

    @Test
    void enfileirarDeveInserirNovosElementosNoFimDaFila() {
        Fila fila = new Fila();
        String elementoIndice0 = "elemento no indice 0";
        String elementoIndice1 = "elemento no indice 1";
        String elementoIndice2 = "elemento no indice 2";

        fila.enfileirar(elementoIndice0);
        fila.enfileirar(elementoIndice1);
        fila.enfileirar(elementoIndice2);
        List<Object> ordemEsperada = Arrays.asList(elementoIndice0, elementoIndice1, elementoIndice2);

        assertEquals(ordemEsperada, fila.getElementos());
    }

    @Test
    void desenfileirarDeveRemoverPrimeiroElementoDaFila() {
        Fila fila = new Fila();
        String elementoIndice0 = "elemento no indice 0";
        String elementoIndice1 = "elemento no indice 1";
        String elementoIndice2 = "elemento no indice 2";
        fila.enfileirar(elementoIndice0);
        fila.enfileirar(elementoIndice1);
        fila.enfileirar(elementoIndice2);

        Object elementoRemovido = fila.desenfileirar();

        assertEquals(elementoIndice0, elementoRemovido);
    }

    @Test
    void isVaziaDeveRetornarVerdadeiroSeFilaEstiverVazia() {
        Fila fila = new Fila();

        assertTrue(fila.isVazia());
    }

    @Test
    // https://www.baeldung.com/java-testing-system-out-println
    // https://stackoverflow.com/a/23095198/22829483
    void deveImprimirConteúdo() {
        PrintStream saidaPadrao = System.out;
        ByteArrayOutputStream saidaStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaStream));

        Fila<String> fila = new Fila<>();
        fila.enfileirar("elemento 1");
        fila.enfileirar("elemento 2");
        fila.enfileirar("elemento 3");

        String saidaEsperada = "elemento 1" + System.lineSeparator() +
                "elemento 2" + System.lineSeparator() + "elemento 3";
        fila.imprimirConteudo();

        assertEquals(saidaEsperada, saidaStream.toString().trim());

        System.setOut(saidaPadrao);
    }
}