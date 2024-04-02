/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX1;

import java.util.Scanner;

/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */
public class testealunos {

 public static void main(String[] args) {
     aluno aluno1;
     aluno aluno2;
     aluno aluno3;
     try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Digite as notas do primeiro aluno (N1 N2 N3 N4):");
         double n1 = sc.nextDouble();
         double n2 = sc.nextDouble();
         double n3 = sc.nextDouble();
         double n4 = sc.nextDouble();
         aluno1 = new aluno(n1, n2, n3, n4);
         System.out.println("Digite as notas do segundo aluno (N1 N2 N3 N4):");
         n1 = sc.nextDouble();
         n2 = sc.nextDouble();
         n3 = sc.nextDouble();
         n4 = sc.nextDouble();
         aluno2 = new aluno(n1, n2, n3, n4);
         System.out.println("Digite as notas do terceiro aluno (N1 N2 N3 N4):");
         n1 = sc.nextDouble();
         n2 = sc.nextDouble();
         n3 = sc.nextDouble();
         n4 = sc.nextDouble();
         aluno3 = new aluno(n1, n2, n3, n4);
     }
        
        
        System.out.println("\nMédia do aluno 1: " + aluno1.getMedia());
        System.out.println("Média do aluno 2: " + aluno2.getMedia());
        System.out.println("Média do aluno 3: " + aluno3.getMedia());
        
        int comparacao12 = aluno1.compararMedia(aluno2);
        int comparacao13 = aluno1.compararMedia(aluno3);
        
     switch (comparacao12) {
         case -1 -> System.out.println("A média do aluno 1 é menor que a do aluno 2.");
         case 0 -> System.out.println("A média do aluno 1 é igual à do aluno 2.");
         default -> System.out.println("A média do aluno 1 é maior que a do aluno 2.");
     }

     switch (comparacao13) {
         case -1 -> System.out.println("A média do aluno 1 é menor que a do aluno 3.");
         case 0 -> System.out.println("A média do aluno 1 é igual à do aluno 3.");
         default -> System.out.println("A média do aluno 1 é maior que a do aluno 3.");
     }
        
        System.out.println("Média total dos alunos: " + aluno.mediaTotal());
    }
}

