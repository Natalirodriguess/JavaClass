package br.com.herencaExemplo;

public class Animal {
    public String raca;

    public Double peso;
    public String comida;

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void setFoto(String raca) {
        this.raca = raca;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public String getComida() {
        return comida;
    }

    public void comer(){
        System.out.println("O animal " + this.raca + " comeu");

    }

    public void movimentar(){
        System.out.println("O animal " + this.raca + " se movimentou");
    }

    public void fazerBarulho (String barulho){
        System.out.println("O animal " + raca + " "+barulho);
    }
}
