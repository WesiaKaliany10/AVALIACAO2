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

public class album extends product{
private String artist;

    public album(String name, double price, int numberOfCopies, String artist) {
        super(name, price, numberOfCopies);
        this.artist = artist;
    }
}
    


