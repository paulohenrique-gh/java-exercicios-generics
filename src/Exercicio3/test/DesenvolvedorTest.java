package Exercicio3.test;

import Exercicio3.main.Desenvolvedor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {
    @Test
    void deveFornecerDescricaoDoCargo() {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcos Damasceno", 9000);
        String descricaoEsperada = "Responsável pela implementação dos requisitos do projeto";

        assertEquals(descricaoEsperada, desenvolvedor.descricaoCargo());
    }
}