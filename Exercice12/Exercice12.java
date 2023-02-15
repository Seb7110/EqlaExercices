package Exercice12;
import java.sql.*;
import java.util.Scanner;



public class Exercice12 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Entrez le nom de l'auteur.");
        Auteur.DisplayAuteur(input.nextLine());
    }

}
