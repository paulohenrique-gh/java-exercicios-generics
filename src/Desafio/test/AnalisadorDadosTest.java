package Desafio.test;

import Desafio.main.AnalisadorDados;
import Desafio.main.ArquivoMarkdown;
import Desafio.main.ArquivoTexto;
import Desafio.main.ArquivoTxt;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AnalisadorDadosTest {
    @Test
    // https://www.digitalocean.com/community/tutorials/junit-assert-exception-expected#junit-5-assert-exception-message
    void deveGerarErroComArquivoNaoLocalizado() {
        AnalisadorDados<ArquivoTexto> analisador = new AnalisadorDados<>();
        Path caminhoInexistente = FileSystems.getDefault().getPath("arquivo_inexistente.txt");
        ArquivoTxt arquivoTxt = new ArquivoTxt(caminhoInexistente.toString());
        analisador.setArquivo(arquivoTxt);

        Exception excecao = assertThrows(IOException.class, analisador::imprimirResumoDados);

        assertEquals("Erro na leitura do arquivo", excecao.getMessage());
    }

    @Test
    void deveDefinirAtributosAoImprimirResumo() throws IOException {
        AnalisadorDados<ArquivoTexto> analisador = new AnalisadorDados<>();
        Path caminhoTxt = FileSystems.getDefault().getPath("src/Desafio/test/arquivo_teste.txt");
        ArquivoTxt arquivoTxt = new ArquivoTxt(caminhoTxt.toString());
        String conteudoTxt = "esse é o arquivo de teste txt\nlinha 2";
        analisador.setArquivo(arquivoTxt);

        analisador.imprimirResumoDados();

        assertEquals(conteudoTxt, analisador.getConteudo());
        assertEquals(2, analisador.getNumLinhas());
        assertEquals(9, analisador.getNumPalavras());
    }

    @Test
    void deveRedefinirAtributosAoMudarArquivo() throws IOException {
        AnalisadorDados<ArquivoTexto> analisador = new AnalisadorDados<>();
        Path caminhoTxt = FileSystems.getDefault().getPath("src/Desafio/test/arquivo_teste.txt");
        ArquivoTxt arquivoTxt = new ArquivoTxt(caminhoTxt.toString());
        analisador.setArquivo(arquivoTxt);
        analisador.imprimirResumoDados();

        Path caminhoMd = FileSystems.getDefault().getPath("src/Desafio/test/arquivo_teste.md");
        ArquivoMarkdown arquivoMarkdown = new ArquivoMarkdown(caminhoMd.toString());
        analisador.setArquivo(arquivoMarkdown);

        assertEquals("", analisador.getConteudo());
        assertEquals(0, analisador.getNumLinhas());
        assertEquals(0, analisador.getNumPalavras());
    }
}