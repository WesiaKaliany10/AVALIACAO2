/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX2;

import java.util.Scanner;

/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */

public class jogodonumerosecreto {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            numeroSecreto jogo = new numeroSecreto();
            
            System.out.println("Bem-vindo ao Jogo do Número Secreto!");
            System.out.println("Um número entre 0 e 100 foi sorteado. Tente adivinhá-lo!");
            
            jogo.sortear();
            
            int palpite;
            int resultado;
            
            do {
                System.out.println("Digite seu palpite:");
                palpite = sc.nextInt();
                
                resultado = jogo.adivinhar(palpite);
                
                switch (resultado) {
                    case -2 -> System.out.println("Você precisa sortear um número primeiro!");
                    case -1 -> System.out.println("O número secreto é maior que o palpite.");
                    case 1 -> System.out.println("O número secreto é menor que o palpite.");
                    default -> {
                    }
                }
                
            } while (resultado != 0);
            
            System.out.println("Parabéns! Você acertou o número secreto!");
        }
    }
}

