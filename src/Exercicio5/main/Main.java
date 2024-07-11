package Exercicio5.main;

public class Main {
    public static void main(String[] args) {
        SuperHeroi homemCaneta = new SuperHeroi("Homem-Caneta");
        Vilao elCorretivo = new Vilao("El Corretivo");
        Ajudante larissaPiseira = new Ajudante("Larissa Piseira");
        GerenciadorPersonagens<Personagem> gerenciador = new GerenciadorPersonagens<>();

        gerenciador.adicionarPersonagem(homemCaneta);
        gerenciador.adicionarPersonagem(elCorretivo);
        gerenciador.adicionarPersonagem(larissaPiseira);

        gerenciador.getPersonagens().forEach(System.out::println);
    }
}
