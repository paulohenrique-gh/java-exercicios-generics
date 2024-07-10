package Exercicio2.test;

import Exercicio2.main.Pai;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaiTest {
    @Test
    void seApresentaInformandoNomeEIdade() {
        Pai pai = new Pai("Fernando", 45);
        String mensagemEsperada = "Me chamo Fernando, tenho 45 anos e sou o pai";

        assertEquals(mensagemEsperada, pai.mensagemApresentacao());
    }
}