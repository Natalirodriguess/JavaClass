package br.com.herencaExemplo;

public class AnimalTeste {
    public static void main (String [] args){
        Galinha marronzia = new Galinha();
        marronzia.raca = "galinha / ave";
        marronzia.comida = "milho";

        marronzia.botarOvos();
        marronzia.comer();

        System.out.println("----------------");

        Cachorro bethoven = new Cachorro();
        bethoven.raca = "cachorro";
        bethoven.comida = "Osso";
        bethoven.peso = 50d;

        bethoven.fazerBarulho("Latiu");
        bethoven.comer();
        bethoven.movimentar();

        System.out.println("----------------");

        Coruja juju = new Coruja();
        juju.raca = "Coruja";

        juju.botarOvos();
        juju.comer();
        juju.movimentar();
    }

}
