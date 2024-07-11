package Desafio.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path pathTxt = FileSystems.getDefault().getPath("src/Desafio/main/teste.txt");
        ArquivoTxt arquivoTxt = new ArquivoTxt(pathTxt.toString());

        if (arquivoTxt.exists()) {
            System.out.println("Arquivo localizado");
        } else {
            System.out.println("Arquivo nao localizado");
        }


    }
}
