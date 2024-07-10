package Exercicio2.main;

public class Pai extends MembroFamilia{
    public Pai(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String mensagemApresentacao() {
        return "Me chamo " + this.getNome() + ", tenho " + this.getIdade() + " anos e sou o pai";
    }
}
