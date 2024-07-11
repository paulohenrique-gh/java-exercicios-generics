package Exercicio2.main;

public class Main {
    public static void main(String[] args) {
        Pai pai = new Pai("José", 45);
        Mae mae = new Mae("Marta", 40);
        Filho filho = new Filho("Carlos", 15);
        Familia<MembroFamilia> familia = new Familia<>();

        familia.adicionarMembro(pai);
        familia.adicionarMembro(mae);
        familia.adicionarMembro(filho);

        familia.getMembros().forEach(membro -> System.out.println(membro.mensagemApresentacao()));
    }
}
