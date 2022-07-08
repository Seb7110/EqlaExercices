import java.util.Scanner;

/**
 * c4e0
 */
public class c4e0 {
    static Scanner input=new Scanner(System.in);
public static void main(String[] args) {
    String userName=ChooseName();
String boatName=ChooseName();
System.out.println(userName + " prend la mer seul sur son bateau le " + boatName + ". Une grande aventure l'attend.");
}
static String ChooseName(){
    String _defaultName="Luffy";
String _defaultboatName="Vogue Merry";
    System.out.println("Votre nom est "+_defaultName+". Voulez-vous le changer? [y/n]");
    System.out.println("Le nom de votre bateau est "+_defaultBoatName+". Voulez-vous le changer ? [y/n]");
String _choice=input.nextLine().toLowerCase();
if (_choice.equals("y")) {
    System.out.println("Quel nom désirez-vous utiliser?");
    _defaultName=input.nextLine(    );
    _defaultName=_defaultName.substring(0, 1).toUpperCase()+_defaultName.substring(1).toLowerCase();
}
    else if(_choice.equals("n")){
System.out.println  ("Vous conservez le nom "+_defaultName);
}
else{
    System.out.println("Entrée incorrecte");
    _defaultName =ChooseName();
return _defaultName;
}
return ConfirmName(_defaultName);
}
static String ConfirmName(String _userName){
System.out.println("Vous ne pourrez plus changer de nom durant toute votre aventure. Confirmez le nom"+_userName+" [y/n]");
String _choice=input.nextLine();
if (_choice.equals("y")){
System.out.println("Entrée validée");
}
else if(_choice.equals("n")){
System.out.println("Pseudo refusé ; réencodez votre pseudo");
_userName=ChooseName();

    }
    else{
        System.out.println("Entrée incorrecte, recommencez");
_userName=ConfirmName(_userName);
    }
return _userName;
 }    
}