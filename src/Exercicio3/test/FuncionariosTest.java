package Exercicio3.test;

import Exercicio3.main.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FuncionariosTest {
    @Test
    void devePermitirAdicionarFuncionario() {
        Funcionarios<Funcionario> funcionarios = new Funcionarios<>();
        Analista analista = new Analista("Ana Lista", 7000);

        funcionarios.adicionarFuncionario(analista);

        assertTrue(funcionarios.getFuncionarios().contains(analista));
    }

    @Test
    void devePermitirRemoverFuncionario() {
        Funcionarios<Funcionario> funcionarios = new Funcionarios<>();
        Designer designer = new Designer("Dênis Silva", 9000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Márcio Santos", 12000);
        funcionarios.adicionarFuncionario(designer);
        funcionarios.adicionarFuncionario(desenvolvedor);

        funcionarios.removerFuncionario(designer);

        assertFalse(funcionarios.getFuncionarios().contains(designer));
        assertTrue(funcionarios.getFuncionarios().contains(desenvolvedor));
    }

    @Test
    void deveFornecerListaDeFuncionarios() {
        Funcionarios<Funcionario> funcionarios = new Funcionarios<>();
        Designer designer = new Designer("Dênis Silva", 9000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Márcio Santos", 12000);
        funcionarios.adicionarFuncionario(designer);
        funcionarios.adicionarFuncionario(desenvolvedor);

        List<Funcionario> listaEsperada = Arrays.asList(designer, desenvolvedor);

        assertEquals(listaEsperada, funcionarios.getFuncionarios());
    }
}