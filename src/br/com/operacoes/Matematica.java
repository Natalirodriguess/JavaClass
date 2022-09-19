package br.com.operacoes;

public class Matematica {
    //métodos
    public Integer maior(Integer A, Integer B) {
        Integer maior;
        if (A > B) {
            maior = A;
            return A;
        }
        maior = B;
        System.out.println(maior);
        return B;
    }

    public double raiz(Integer numero){
        Double raiz = 1d;
        raiz = 1*Math.sqrt(numero);
        //System.out.println(raiz);

        return raiz;
    }

    public Integer soma (Integer numero1, Integer numero2){
        Integer soma = numero1 + numero2;
        System.out.println(soma);
        return soma;
    }
}
