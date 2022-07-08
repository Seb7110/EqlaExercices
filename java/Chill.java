import java.util.Scanner;

/**
 * Chill
 */
public class Chill {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = ChooseName("personnage", "Luffy");
        String boatName = ChooseName("bateau","Vogue Merry");
        System.out.println(userName + " prend la mer seul sur son bateau le " + boatName + ", une grande aventure l'attend !");
    }
    static String ChooseName(String _whatToRename, String _defaultName)
    {
        System.out.println("le nom de votre " + _whatToRename + " est " + _defaultName + " voulez vous le changer ? \n[o/n]");
        String _choice = input.nextLine().toLowerCase();
        // Partie 1 : Choix du changement de pseudo
        if(_choice.equals("o") )
        {
            System.out.println("Quel est le nom que vous voulez pour votre " + _whatToRename + " ?");
            _defaultName = input.nextLine();
            _defaultName = _defaultName.substring(0, 1).toUpperCase() + _defaultName.substring(1).toLowerCase();
        }
        else if (_choice.equals("n"))
        {
            System.out.println("Vous allez conserver le nom " + _defaultName + " pour votre " + _whatToRename);
        }
        else
        {
            System.out.println("Entrée incorrecte, recommencez");
            _defaultName = ChooseName(_whatToRename,_defaultName);
            // Super intéressant !
            return _defaultName;
        }
        return ConfirmName(_whatToRename, _defaultName);
    }
    static String ConfirmName(String _whatToRename, String _defaultName)
    {
        // Partie 2 : Validation du pseudo
        System.out.println("Vous ne pourrez pas changer le nom de votre " + _whatToRename + " durant toute votre aventure. Confirmer le nom : " + _defaultName + "\n[o/n]");
        String _choice = input.nextLine().toLowerCase();
        if(_choice.equals("o"))
        {
            System.out.println("Entrée validée.");
        }
        else if (_choice.equals("n"))
        {
            System.out.println("Entrée refusée, re-choisissez un nom pour votre " + _whatToRename + ".");
            _defaultName = ChooseName(_whatToRename,_defaultName);
        }
        else
        {
            System.out.println("Entrée incorrecte, recommencez.");
            _defaultName = ConfirmName(_whatToRename,_defaultName);
        }
        return _defaultName;
    }
    // static String ChooseName()
    // {
    //     String _defaultName = "Luffy";
    //     System.out.println("Votre nom est " + _defaultName + " voulez vous le changer ? \n[o/n]");
    //     String _choice = input.nextLine().toLowerCase();
    //     // Partie 1 : Choix du changement de pseudo
    //     if(_choice.equals("o") )
    //     {
    //         System.out.println("Quel est le nom que vous voulez ?");
    //         _defaultName = input.nextLine();
    //         _defaultName = _defaultName.substring(0, 1).toUpperCase() + _defaultName.substring(1).toLowerCase();
    //     }
    //     else if (_choice.equals("n"))
    //     {
    //         System.out.println("Vous allez conserver le nom " + _defaultName);
    //     }
    //     else
    //     {
    //         System.out.println("Entrée incorrecte, recommencez");
    //         _defaultName = ChooseName();
    //     }
    //     return ConfirmName(_defaultName);
    // }
    // static String ConfirmName(String _defaultName)
    // {
    //     // Partie 2 : Validation du pseudo
    //     System.out.println("Vous ne pourrez pas changer de nom durant toute votre aventure. Confirmer le nom : " + _defaultName + "\n[o/n]");
    //     String _choice = input.nextLine().toLowerCase();
    //     if(_choice.equals("o"))
    //     {
    //         System.out.println("Pseudo Validé.");
    //     }
    //     else if (_choice.equals("n"))
    //     {
    //         System.out.println("Pseudo refusé, ré-encodez votre pseudo.");
    //         _defaultName = ChooseName();
    //     }
    //     else
    //     {
    //         System.out.println("Entrée incorrecte, recommencez.");
    //         _defaultName = ConfirmName(_defaultName);
    //     }
    //     return _defaultName;
    // }
}