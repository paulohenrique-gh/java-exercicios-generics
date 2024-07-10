package Exercicio3.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Funcionarios<T extends Funcionario> {
    private Set<T> funcionarios;

    public Funcionarios(){
        this.funcionarios = new HashSet<>();
    }

    public List<T> getFuncionarios(){
        return this.funcionarios.stream().toList();
    }

    public void addFuncionario(T funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(T funcionario){
        this.funcionarios.remove(funcionario);
    }
}
