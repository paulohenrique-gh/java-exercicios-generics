package Exercicio2.main;

public abstract class MembroFamilia {
    protected String nome;
    protected int idade;

    protected MembroFamilia(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String mensagemApresentacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
