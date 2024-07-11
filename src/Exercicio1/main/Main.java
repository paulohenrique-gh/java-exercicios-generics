package Exercicio1.main;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        System.out.println("Conteúdo atual: ");
        fila.imprimirConteudo();
        System.out.println("Está vazia? " + fila.isVazia());
        System.out.println("====");

        fila.enfileirar("Janela");
        fila.enfileirar("Porta");
        fila.enfileirar("Cadeira");
        System.out.println("Conteúdo atual: ");
        fila.imprimirConteudo();
        System.out.println("Está vazia? " + fila.isVazia());
        System.out.println("====");

        fila.desenfileirar();
        System.out.println("Conteúdo atual: ");
        fila.imprimirConteudo();

    }
}