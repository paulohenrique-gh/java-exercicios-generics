package Exercicio2.main;

public class Mae extends MembroFamilia{
    public Mae(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String mensagemApresentacao() {
        return "Meu nome é " + this.getNome() + ", tenho " + this.getIdade() + " anos e sou a mãe da família";
    }
}
