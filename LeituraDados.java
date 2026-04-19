package com.java.leituradados;
import java.util.Scanner;
/// CTRL + SPACE = Automatic Imports YEAAAAAAAAAs
public class LeituraDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Biqueira ZS");
			///obs: nome ficticio
        System.out.println("Opcoes disponiveis:");
        System.out.println("1 - Prensado");
        System.out.println("2 - Skunk");
        System.out.println("3 - Dry");
        System.out.println("Qual voce deseja?");

        int escolhas = sc.nextInt();
			///pede uma resposta - numero.
        if (escolhas == 1) {
            System.out.println("tu escolheu o prensado, toma! boa brisa.");
        } else if (escolhas == 2) {
            System.out.println("tu escolheu o skunk, toma! boa brisa camarada.");
        } else if (escolhas == 3){
            System.out.println("tu escolheu o dry, toma! boa brisa man");
        } else {
            System.out.println("opcao invalida");
        }
    }
}
