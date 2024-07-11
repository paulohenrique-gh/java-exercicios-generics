package Exercicio3.main;

public class Main {
    public static void main(String[] args) {
         Analista analista = new Analista("Pedro", 5000);
         Designer designer = new Designer("Marta", 4000);
         Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 10000);
         Funcionarios<Funcionario> funcionarios = new Funcionarios<>();

         funcionarios.adicionarFuncionario(analista);
         funcionarios.adicionarFuncionario(designer);
         funcionarios.adicionarFuncionario(desenvolvedor);

         funcionarios.getFuncionarios().forEach(funcionario -> System.out.println(funcionario.descricaoCargo()));
    }
}
