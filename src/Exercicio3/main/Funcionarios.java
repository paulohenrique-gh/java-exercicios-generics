package Exercicio3.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Funcionarios<T extends Funcionario> {
    private List<T> funcionarios;

    public Funcionarios(){
        this.funcionarios = new ArrayList<>();
    }

    public List<T> getFuncionarios(){
        return this.funcionarios;
    }

    public void adicionarFuncionario(T funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario){
        this.funcionarios.remove(funcionario);
    }
}
