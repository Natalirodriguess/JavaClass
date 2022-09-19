package br.com.operacoes;

public class MatematicaTeste {
    public static void main(String [] args){

        Matematica matematica = new Matematica();
        matematica.maior(4,6);
        matematica.soma(5,8);
        matematica.raiz(4);
        System.out.println(matematica.raiz(4));
    }
}
