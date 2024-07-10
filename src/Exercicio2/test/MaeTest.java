package Exercicio2.test;

import Exercicio2.main.Mae;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaeTest {
    @Test
    void seApresentaInformandoNomeEIdade() {
        Mae mae = new Mae("Marcia", 39);
        String mensagemEsperada = "Meu nome é Marcia, tenho 39 anos e sou a mãe da família";

        assertEquals(mensagemEsperada, mae.mensagemApresentacao());
    }
}