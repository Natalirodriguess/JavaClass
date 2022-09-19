package br.com.encapsulamentoExemplo;

public class FuncionarioTeste {

    public static void main(String [] args){
        System.out.println("Funcionários ativos!");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas Luco");
        funcionario.isAtivo();
    }
}
