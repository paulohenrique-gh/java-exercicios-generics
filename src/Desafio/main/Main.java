package Desafio.main;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        AnalisadorDados<ArquivoTexto> analisadorDados = new AnalisadorDados<>();

        try {
            Path caminhoTxt = FileSystems.getDefault().getPath("src/Desafio/main/teste.txt");
            ArquivoTxt arquivoTxt = new ArquivoTxt(caminhoTxt.toString());

            analisadorDados.setArquivo(arquivoTxt);
            analisadorDados.imprimirResumoDados();

            System.out.println("====");

            Path caminhoMd = FileSystems.getDefault().getPath("src/Desafio/main/teste.md");
            ArquivoMarkdown arquivoMarkdown = new ArquivoMarkdown(caminhoMd.toString());

            analisadorDados.setArquivo(arquivoMarkdown);
            analisadorDados.imprimirResumoDados();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
