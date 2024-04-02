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

public class stockKeeper {
private String name;

    public stockKeeper(String name) {
        this.name = name;
    }

    public void manageMovie(movie movie, String name, String director, double price, int numberOfCopies) {
        movie = new movie(name, price, numberOfCopies, director);
        System.out.println("Filme armazenado: " + movie.toString());
    }

    public void manageAlbum(album album, String name, String artist, double price, int numberOfCopies) {
        album = new album(name, price, numberOfCopies, artist);
        System.out.println("Album armazenado: " + album.toString());
    }
}

