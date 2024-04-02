/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX3;

/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */
public class product {

    private String name;
    private double price;
    private int numberOfCopies;

    public product(String name, double price, int numberOfCopies) {
        this.name = name;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    }

    public void sellCopies() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println("Uma copia de  " + name + " vendida. Restam : " + numberOfCopies);
        } else {
            System.out.println("Nenhum copia de  " + name);
        }
    }

    public void orderCopies(int num) {
        numberOfCopies += num;
        System.out.println(num + " copias de  " + name + " ordenadas. Total de copias " + numberOfCopies);
    }
}
