package Exercice12;
import java.util.Date;;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercice12 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //java -cp .:Exercice12/m.jar: Exercice12/Exercice12.java
        System.out.println("entrez le nom de l'auteur");
        Auteur.DisplayAuteur(input.nextLine());
        System.out.println("saisissez l'id de l'auteur à modifier, composé de chiffre, ");
        Auteur.DisplayAuteur(input.nextInt());
        input.nextLine();
        System.out.println("Saisissez les nouvelles informations de l'auteur, en commençant par le nom.");
        String newNom = input.nextLine();
        System.out.println("le prénom,");
        String newPrenom = input.nextLine();
        System.out.println("la nationalité,");
        String newNationalite = input.nextLine();
        System.out.println("l'identifiant, constitué uniquement de chiffre,");
        Integer newId = input.nextInt();
        input.nextLine();
        System.out.println("pour finir, la date de naissance.");
        String dateStr = input.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date newDatenaissance = format.parse(dateStr);        

        Auteur modifInfo = new Auteur(newId, newNom, newPrenom, newNationalite, newDatenaissance);
        Auteur.UpdateAuteur(modifInfo);
        Auteur.DisplayAuteur(newId);

    }

}
