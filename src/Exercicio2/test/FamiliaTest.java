package Exercicio2.test;

import Exercicio2.main.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamiliaTest {
    @Test
    void devePermitirAdicionarMembro() {
        Familia<MembroFamilia> familia = new Familia<>();
        Pai pai = new Pai("Valter", 35);
        familia.adicionarMembro(pai);

        assertTrue(familia.getMembros().contains(pai));
    }

    @Test
    void devePermitirRemoverMembro() {
        Familia<MembroFamilia> familia = new Familia<>();
        Pai pai = new Pai("Valter", 35);
        familia.adicionarMembro(pai);
        familia.adicionarMembro(new Mae("Marina", 34));
        familia.adicionarMembro(new Filho("Valter Junior", 12));

        familia.removerMembro(pai);

        assertFalse(familia.getMembros().contains(pai));
    }

    @Test
    void deveFornecerListaDeMembros() {
        Familia<MembroFamilia> familia = new Familia<>();
        Pai pai = new Pai("Valter", 35);
        Mae mae = new Mae("Marina", 34);
        Filho filho = new Filho("Valter Junior", 12);
        familia.adicionarMembro(pai);
        familia.adicionarMembro(mae);
        familia.adicionarMembro(filho);

        List<MembroFamilia> listaEsperada = Arrays.asList(pai, mae, filho);

        assertEquals(listaEsperada, familia.getMembros());
    }
}