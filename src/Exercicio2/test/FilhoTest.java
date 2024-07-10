package Exercicio2.test;

import Exercicio2.main.Filho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilhoTest {
    @Test
    void seApresentaInformandoNomeEIdade() {
        Filho filho = new Filho("Enzo", 12);
        String mensagemEsperada = "Eu sou Enzo e tenho 12 anos";

        assertEquals(mensagemEsperada, filho.mensagemApresentacao());
    }
}