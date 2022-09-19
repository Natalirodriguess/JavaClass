package br.com.animais;

import br.com.animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Curso Bradesco!");


        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = " Alvin";
        cachorro1.cor= " amarelo";
        cachorro1.tamanho= 89.15d;
        cachorro1.email = "cachorro1@gmail.com";

        cachorro1.mostrarCachorro();
        cachorro1.nomePreenchido();
        cachorro1.latir();

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "";
        cachorro2.cor = "marrom";
        cachorro2.tamanho = 100.2d;
        cachorro2.email = "";

        cachorro2.mostrarCachorro();
        cachorro2.latir();
    }
}