/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX3;
import java.util.Scanner;
/**
 *
 * @author Wesia Kaliany Lima Peixoto < kalianywesia2005@gmail.com >
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
 * @date 01/04/2024
 * @brief class $(nome)
 */
public class testeExjava {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Album 1:");
        System.out.print("Nome: ");
        String albumName1 = sc.nextLine();
        System.out.print("Artista: ");
        String artist1 = sc.nextLine();
        System.out.print("Preço: ");
        double price1 = sc.nextDouble();
        System.out.print("Número de copias: ");
        int copies1 = sc.nextInt();

        System.out.println("Digite o Album 2:");
        System.out.print("Nome: ");
        sc.nextLine();  // Consume newline left-over
        String albumName2 = sc.nextLine();
        System.out.print("Artista: ");
        String artist2 = sc.nextLine();
        System.out.print("Preço: ");
        double price2 = sc.nextDouble();
        System.out.print("Número de copias: ");
        int copies2 = sc.nextInt();

        System.out.println("Digite o Filme 1:");
        System.out.print("Nome: ");
        sc.nextLine();  // Consume newline left-over
        String movieName1 = sc.nextLine();
        System.out.print("Diretor: ");
        String director1 = sc.nextLine();
        System.out.print("Preço: ");
        double moviePrice1 = sc.nextDouble();
        System.out.print("Número de copias: ");
        int movieCopies1 = sc.nextInt();

        System.out.println("Digite o Filme 2:");
        System.out.print("Nomee: ");
        sc.nextLine();  // Consume newline left-over
        String movieName2 = sc.nextLine();
        System.out.print("Diretor: ");
        String director2 = sc.nextLine();
        System.out.print("Preço: ");
        double moviePrice2 = sc.nextDouble();
        System.out.print("Número de copias: ");
        int movieCopies2 = sc.nextInt();

        sc.close();

        album album1 = new album(albumName1, price1, copies1, artist1);
        album album2 = new album(albumName2, price2, copies2, artist2);
        movie movie1 = new movie(movieName1, moviePrice1, movieCopies1, director1);
        movie movie2 = new movie(movieName2, moviePrice2, movieCopies2, director2);

        stockKeeper stockKeeper = new stockKeeper("Estoque");

        stockKeeper.manageAlbum(album1, albumName1, artist1, price1, copies1);
        stockKeeper.manageAlbum(album2, albumName2, artist2, price2, copies2);
        stockKeeper.manageMovie(movie1, movieName1, director1, moviePrice1, movieCopies1);
        stockKeeper.manageMovie(movie2, movieName2, director2, moviePrice2, movieCopies2);
    }
}
