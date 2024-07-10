package Exercicio3.main;

public abstract class Funcionario {
    private String nome;
    private double salario;

    protected Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract String descricaoCargo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
