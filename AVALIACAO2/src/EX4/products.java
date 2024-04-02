/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX4;


/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */
public class products {

    private String nome;
    private double preco;
    private int quantidade;

    public products(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionar() {
        this.quantidade++;
    }

    public void remover() {
        if (this.quantidade > 0) {
            this.quantidade--;
        } else {
            System.out.println("Não há " + this.nome + " na lista de compras.");
        }
    }

    public double getTotal() {
        return this.preco * this.quantidade;
    }
}
