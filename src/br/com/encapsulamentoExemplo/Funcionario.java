package br.com.encapsulamentoExemplo;

public class Funcionario {
    private String nome;
    private Boolean ativo;

    public void setNome(String nome){
        this.nome = nome;
        System.out.println("O nome do funcionáio é "+ this.nome);
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }

    public String getNome(){
        return nome;
    }

    public Boolean isAtivo (){
        String status;
        if (getNome().isEmpty()){
            ativo = false;
            status = "Não ativo";
            System.out.println("Funcionário " +status);
        }
        ativo = true;
        status = "Ativo!";
        System.out.println("Funcionário"+ status);
        return ativo;


    }
}
