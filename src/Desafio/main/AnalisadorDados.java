package Desafio.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AnalisadorDados<T extends ArquivoTexto> {
    private T arquivo;
    private String conteudo;
    private int numLinhas;
    private int numPalavras;

    public AnalisadorDados() {}

    // https://www.w3schools.com/java/java_files_read.asp
    // https://www.baeldung.com/java-try-with-resources
    private void analisarConteudo() throws IOException {
        try (Scanner leitor = new Scanner(this.arquivo)) {
            StringBuilder stringBuilder = new StringBuilder();
            int contadorLinhas = 0;
            int contadorPalavras = 0;

            while (leitor.hasNextLine()) {
                contadorLinhas++;
                String linha = leitor.nextLine();
                contadorPalavras += linha.split(" ").length;
                stringBuilder.append(linha);
                stringBuilder.append("\n");
            }

            this.setConteudo(stringBuilder.toString().trim());
            this.setNumLinhas(contadorLinhas);
            this.setNumPalavras(contadorPalavras);
        } catch (IOException e) {
            throw new IOException("Erro na leitura do arquivo");
        };
    }

    public void imprimirResumoDados() throws IOException {
        this.analisarConteudo();

        System.out.println("Nome do arquivo: " + this.arquivo.getName() +
                "\nNúmero de linhas: " + this.getNumLinhas() +
                "\nNúmero de palavras: " + this.getNumPalavras() +
                "\nConteúdo: \n" + this.getConteudo());

    }

    public T getArquivo() {
        return arquivo;
    }

    public void setArquivo(T arquivo) {
        this.arquivo = arquivo;
        this.setConteudo("");
        this.setNumLinhas(0);
        this.setNumPalavras(0);
    }

    private void setNumLinhas(int numLinhas) {
        this.numLinhas = numLinhas;
    }

    public int getNumLinhas() {
        return this.numLinhas;
    }

    private void setNumPalavras(int numPalavras)  {
        this.numPalavras = numPalavras;
    }

    public int getNumPalavras() {
        return this.numPalavras;
    }

    private void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }
}
