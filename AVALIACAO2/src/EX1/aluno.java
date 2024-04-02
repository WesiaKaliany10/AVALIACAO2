/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX1;

/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */
public class aluno {

private final double N1;
    private final double N2;
    private final double N3;
    private final double N4;
    private double media;
    public static int numeroDeAlunos = 0;
    public static double somaDeMedidas = 0;

    public aluno(double n1, double n2, double n3, double n4) {
        this.N1 = n1;
        this.N2 = n2;
        this.N3 = n3;
        this.N4 = n4;
        calcularMedia();
        numeroDeAlunos++;
        somaDeMedidas += this.media;
    }

    private void calcularMedia() {
        this.media = (this.N1 * 1 + this.N2 * 2 + this.N3 * 3 + this.N4 * 4) / 10;
    }

    public double getMedia() {
        return this.media;
    }

    public int compararMedia(aluno outroAluno) {
        if (this.media < outroAluno.getMedia()) {
            return -1;
        } else if (this.media == outroAluno.getMedia()) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double mediaTotal() {
        if (numeroDeAlunos == 0) {
            return 0;
        }
        return somaDeMedidas / numeroDeAlunos;
    }
}

