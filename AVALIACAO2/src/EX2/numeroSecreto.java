/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX2;

/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */

public class numeroSecreto {
private int numeroAleatorio = -1;

    public void sortear() {
        this.numeroAleatorio = (int) Math.round(Math.random() * 100); // Gera um número aleatório entre 0 e 100
    }

    public int adivinhar(int palpite) {
        if (this.numeroAleatorio == -1) {
            return -2; // Número ainda não foi sorteado
        } else if (palpite < this.numeroAleatorio) {
            return -1; // Palpite é menor que o número secreto
        } else if (palpite == this.numeroAleatorio) {
            return 0; // Palpite é igual ao número secreto
        } else {
            return 1; // Palpite é maior que o número secreto
        }
    }
}

