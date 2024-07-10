package Exercicio3.main;

public class Analista extends Funcionario{
    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String descricaoCargo() {
        return "Especialista em análise de requerimentos";
    }
}
