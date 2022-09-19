package br.com.erros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    public static void main (String [] args){
        try {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para o numerador: ");
        int numero1 = input.nextInt();

        System.out.println("Digite um numero para o denominador: ");
        int numero2 = input.nextInt();

        System.out.println(numero1/numero2);
        }
        catch (InputMismatchException e_1){
            System.out.println("Erro de InputMismatchException detectado!");

        }
        catch (Throwable e_2){
            System.out.println("Erro de Throwable detectado!");
        }




    }
}