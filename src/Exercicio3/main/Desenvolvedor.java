package Exercicio3.main;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String descricaoCargo() {
        return "Responsável pela implementação dos requisitos do projeto";
    }
}
