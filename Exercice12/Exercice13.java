import java.util.Date;
import java.util.Scanner;
import java.sql.*;
import java.text.SimpleDateFormat;

import Exercice12.Auteur;


public class Exercice13 {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Saisissez les informations de l'auteur, en commençant par le nom.");
        String newNom = input.nextLine();
        System.out.println("le prénom,");
        String newPrenom = input.nextLine();
        System.out.println("la nationalité,");
        String newNationalite = input.nextLine();
        System.out.println("pour finir, la date de naissance.");
        String dateStr = input.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date newDatenaissance = format.parse(dateStr);        
Auteur ajoutAuteur = new Auteur(null, newNom, newPrenom, newNationalite, newDatenaissance);
Auteur.insertAuteur(ajoutAuteur);
Auteur.DisplayAuteur(ajoutAuteur);

    
}
    
}