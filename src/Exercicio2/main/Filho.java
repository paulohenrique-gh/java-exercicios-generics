package Exercicio2.main;

public class Filho extends MembroFamilia{
    public Filho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String mensagemApresentacao() {
        return "Eu sou " + this.getNome() + " e tenho " + this.getIdade() + " anos";
    }
}
