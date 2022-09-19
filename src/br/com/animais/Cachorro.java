package br.com.animais;

public class Cachorro {
    public String nome;
    public Double tamanho;
    public String cor;
    public String email;

    public Boolean nomePreenchido(){

        if (nome.isEmpty()){
            System.out.println("O nome do cachorro não existe, por favor, dê um nome!");
            return false;
        }
        return true;
    }
    public void mostrarCachorro(){
        if (nome.isEmpty()){
            System.out.println("O nome do cachorro não existe, por favor, dê um nome!");

        } else {   System.out.println("O nome do cachorro é "+ nome);
        System.out.println("O tamanho do cachorro é "+ tamanho+" cm");
        System.out.println("A cor do cachorro é "+ cor);
        System.out.println("O e-mail para contato do cachorro é: "+   email);}

    }
    public void latir(){

        if ( nomePreenchido().booleanValue() ){
            System.out.println("O cachorro"+ nome + " latiu");
            System.out.println("  ");
            System.out.println("  ");

        }
    }

}
