package Exercicio3.test;

import Exercicio3.main.Designer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignerTest {
    @Test
    void deveFornecerDescricaoDoCargo() {
        Designer designer = new Designer("Carla Vasconcelos", 8000);
        String descricaoEsperada = "Responsável pelos detalhes visuais do projeto";

        assertEquals(descricaoEsperada, designer.descricaoCargo());
    }
}