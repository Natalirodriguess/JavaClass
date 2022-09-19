package br.com.contaBancaria;

public class Conta {
    private String cliente;
    private Double saldo;

    public String getCliente(){
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void exibeSaldo() {
        System.out.println("A conta de "+ cliente + " foi criada!");
        System.out.println("O saldo é de R$" + saldo);
    }


    public void sacarValor(Double valor) {
        if (saldo > 0 && saldo > valor) {
            saldo -= valor;
            System.out.println("O valor R$"+ valor +" foi sacado e resta R$"+saldo+" de saldo");
        } else{
            System.out.println("Saldo insuficiente para o saque de R$"+ valor);
        }
    }
    /*public void transferirPara(Conta conta, Double valor){
        if (saldo > 0 && saldo > valor) {

                System.out.println("O valor de R$"+ valor+ " foi transferido com sucesso na conta "+ conta);
                conta.saldo = saldo + valor;
                System.out.println("E o saldo  da conta "+ conta + " é de " + saldo );

       } else{
           System.out.println("Saldo insuficiente para transferência!");
        }

    }*/
    public void depositar(Double valor){
            if(valor > 0){
                saldo = saldo + valor;
                System.out.println("O valor de R$"+ valor+ " foi depositado e agora o saldo é de R$"+ getSaldo()+ " na conta " + getCliente());
            }
    }

    public void transferirPara(Conta conta, Double valor){
        if (saldo > 0 && saldo > valor) {
            this.sacarValor(valor);
            conta.depositar(valor);

            System.out.println("O valor de R$"+ valor+ " foi transferido com sucesso na conta "+ conta.getCliente());
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }

    }
}