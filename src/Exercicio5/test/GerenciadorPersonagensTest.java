package Exercicio5.test;

import Exercicio5.main.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorPersonagensTest {
    @Test
    void devePermitirAdicionarPersonagem() {
        GerenciadorPersonagens<Personagem> gerenciador = new GerenciadorPersonagens<>();
        SuperHeroi homemCodorna = new SuperHeroi("Homem-Codorna");

        gerenciador.adicionarPersonagem(homemCodorna);

        assertTrue(gerenciador.getPersonagens().contains(homemCodorna));
    }

    @Test
    void devePermitirRemoverPersonagem() {
        GerenciadorPersonagens<Personagem> gerenciador = new GerenciadorPersonagens<>();
        SuperHeroi homemCodorna = new SuperHeroi("Homem-Codorna");
        gerenciador.adicionarPersonagem(homemCodorna);

        gerenciador.removerPersonagem(homemCodorna);

        assertFalse(gerenciador.getPersonagens().contains(homemCodorna));
    }

    @Test
    void deveFornecerListaDePersonagens() {
        GerenciadorPersonagens<Personagem> gerenciador = new GerenciadorPersonagens<>();
        SuperHeroi homemCodorna = new SuperHeroi("Homem-Codorna");
        Vilao roger = new Vilao("Roger");
        Ajudante skeeter = new Ajudante("Skeeter");
        gerenciador.adicionarPersonagem(homemCodorna);
        gerenciador.adicionarPersonagem(roger);
        gerenciador.adicionarPersonagem(skeeter);

        List<Personagem> listaEsperada = Arrays.asList(homemCodorna, roger, skeeter);

        assertEquals(listaEsperada, gerenciador.getPersonagens());
    }
}