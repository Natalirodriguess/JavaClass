package br.com.contaBancaria;

public class ContaTeste {
    public static void main(String [] args){
        System.out.println("Conta Bancária!");
        System.out.println("-----------------");
        Conta conta_Inacio = new Conta();
        conta_Inacio.setCliente("Inácio");
        conta_Inacio.setSaldo(250d);

        conta_Inacio.exibeSaldo();
        conta_Inacio.sacarValor(100d);
        conta_Inacio.depositar(50d);
        System.out.println("---------------------------------");

        Conta conta_Bel = new Conta();
        conta_Bel.setCliente("Natalí");
        conta_Bel.setSaldo(500d);

        conta_Bel.exibeSaldo();
        conta_Bel.sacarValor(560d);
        conta_Bel.depositar(250d);
        conta_Bel.transferirPara(conta_Inacio, 700d);


    }
}
