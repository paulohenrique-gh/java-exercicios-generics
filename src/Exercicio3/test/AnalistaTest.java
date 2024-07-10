package Exercicio3.test;

import Exercicio3.main.Analista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaTest {
    @Test
    void deveFornecerDescricaoDoCargo() {
        Analista analista = new Analista("Carlos Batista", 5000);
        String descricaoEsperada = "Especialista em análise de requerimentos";

        assertEquals(descricaoEsperada, analista.descricaoCargo());
    }
}