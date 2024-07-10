package Exercicio3.main;

import javax.swing.*;

public class Designer extends Funcionario {
    public Designer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String descricaoCargo() {
        return "Responsável pelos detalhes visuais do projeto";
    }
}
