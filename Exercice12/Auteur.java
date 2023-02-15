package Exercice12;

import java.util.Date;
import java.util.Scanner;
import java.sql.*;

public class Auteur {

    // propriétés

    private Integer id;
    private String nom, prenom, nationalite;
    private Date date_naissance;

    // constructeur

    public Auteur(Integer id, String nom, String prenom, String nationalite, Date date_naissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.date_naissance = date_naissance;
    }

    // getters

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    // méthodes

    public static void UpdateAuteur(Auteur _auteur) {
        try (ClassDb db = new ClassDb()) {
            Connection con = db.getConnection();
            PreparedStatement pstmt = con.prepareStatement(
                    "UPDATE auteur SET nom=?, prenom = ?, date_naissance = ?, nationalite = ? WHERE id =?");
            pstmt.setString(1, _auteur.getNom());
            pstmt.setString(2, _auteur.getPrenom());
            java.sql.Date dateSql = new java.sql.Date(_auteur.date_naissance.getTime());
            pstmt.setDate(3, dateSql);
            pstmt.setString(4, _auteur.getNationalite());
            pstmt.setInt(5, _auteur.getId());
            int _nbEnregistrements = pstmt.executeUpdate();
            if (_nbEnregistrements == 1) {
                System.out.println("L'auteur a été modifié.");
            } else {
                System.out.println("Aucun enregistrement n'a été modifié.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void DisplayAuteur(String _nom) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de l'auteur que vous recherchez.");
        _nom = sc.nextLine();
        try (ClassDb db = new ClassDb()) {
            Connection con = db.getConnection();
            PreparedStatement pstmt = con
                    .prepareStatement("SELECT id, nom, prenom, date_naissance, nationalite FROM auteur WHERE nom = ?");
            pstmt.setString(1, _nom);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t\t" + rs.getString("nom") + "\t\t" + rs.getString("prenom") + "\t\t"
                                + rs.getDate("date_naissance") + "\t\t" + rs.getString("nationalite"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void DisplayAuteur(Integer _id) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Entrez l'identifiant de l'auteur que vous recherchez.\nCelui-ci doit être uniquement constitué de chiffre.");
        _id = sc.nextInt();
        try (ClassDb db = new ClassDb()) {
            Connection con = db.getConnection();
            PreparedStatement pstmt = con
                    .prepareStatement("SELECT id, nom, prenom, date_naissance, nationalite FROM auteur WHERE id = ?");
            pstmt.setInt(1, _id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t\t" + rs.getString("nom") + "\t\t" + rs.getString("prenom") + "\t\t"
                                + rs.getDate("date_naissance") + "\t\t" + rs.getString("nationalite"));
            } else {
                System.out.println("Auteur non trouvé");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void DisplayAuteur(Auteur _Auteur) {
        System.out.println(_Auteur.toString());
    }

    @Override
    public String toString() {
        return "Auteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nationalite=" + nationalite
                + ", date_naissance=" + date_naissance + "]";
    }

}
