/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */

public class testeCafeteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<products> produtos = new ArrayList<>();

        // Criando os produtos
        products expresso = new products("Café Expresso", 0.75);
        products capuccino = new products("Café Capuccino", 1.0);
        products leiteComCafe = new products("Leite com Café", 1.25);
        products descafeinado = new products("Café Descafeinado", 0.80);
        products chaVerde = new products("Chá Verde", 1.5);
        products chocolateQuente = new products("Chocolate Quente", 2.0);

        produtos.add(expresso);
        produtos.add(capuccino);
        produtos.add(leiteComCafe);
        produtos.add(descafeinado);
        produtos.add(chaVerde);
        produtos.add(chocolateQuente);

        int opcao;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Pagar conta parcial");
            System.out.println("4 - Pagar conta total");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    listarProdutos(produtos);
                    System.out.println("Escolha um produto para adicionar: ");
                    int produtoAdicionar = sc.nextInt();
                    if (produtoAdicionar >= 1 && produtoAdicionar <= produtos.size()) {
                        produtos.get(produtoAdicionar - 1).adicionar();
                        System.out.println(produtos.get(produtoAdicionar - 1).getNome() + " adicionado.");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    listarProdutos(produtos);
                    System.out.println("Escolha um produto para remover: ");
                    int produtoRemover = sc.nextInt();
                    if (produtoRemover >= 1 && produtoRemover <= produtos.size()) {
                        produtos.get(produtoRemover - 1).remover();
                        System.out.println(produtos.get(produtoRemover - 1).getNome() + " removido.");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    double totalParcial = calcularTotal(produtos);
                    System.out.println("Total da conta parcial: " + totalParcial);
                    break;
                case 4:
                    double total = calcularTotal(produtos);
                    System.out.println("Total da conta: " + total);
                    break;
                case 5:
                    if (calcularTotal(produtos) > 0) {
                        System.out.println("Conta em aberto. Por favor, pague a conta antes de sair.");
                    } else {
                        System.out.println("Saindo...");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 5);

        sc.close();
    }

    public static void listarProdutos(List<products> produtos) {
        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + " - " + produtos.get(i).getNome() + " - R$" + produtos.get(i).getPreco());
        }
    }

    public static double calcularTotal(List<products> produtos) {
        double total = 0;
        for (products produto : produtos) {
            total += produto.getTotal();
        }
        return total;
    }
}

