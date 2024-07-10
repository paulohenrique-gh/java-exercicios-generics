package Exercicio1.test;

import Exercicio1.main.Fila;
import org.junit.jupiter.api.Test;

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
}