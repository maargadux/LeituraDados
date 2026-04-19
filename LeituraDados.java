package com.java.leituradados;
import java.util.Scanner;

///CTRL + SPACE == Automatic Space yeeaaasss

public class LeituraDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	///obs: nome ficticio
        System.out.println("Biqueira ZS");
		
            System.out.println("Opcoes disponiveis:");
            System.out.println("1 - Prensado");
            System.out.println("2 - Skunk");
            System.out.println("3 - Dry");
            System.out.println("Qual voce deseja?");

            int escolha = sc.nextInt();
		///pede uma resposta - numero.
            if (escolha == 1) {
                System.out.println("tu escolheu o prensado, toma! boa brisa.");
            } else if (escolha == 2) {
                System.out.println("tu escolheu o skunk, toma! boa brisa.");
            } else if (escolha == 3) {
                System.out.println("tu escolheu o dry, toma! boa brisa.");
            } else {
                System.out.println("opcao invalida");
            }
        }
    }
}
