import java.util.Scanner;

public class C4e3 {
    static Scanner input=new Scanner(System.in);

public static void main(String[] args) {
    int classe=ChooseClass();
}
static int ChooseClass(){
    System.out.println("Quelle classe voulez-vous choisir ? \n 1 - Guerrier ; \n 2 - Mage ; \n 3 - Voleur ; \n 4 - Prêtre ;");
int choice=input.nextInt();
if (choice==1) {
    System.out.println("Le guerrier fait preuve de courage qui est une vertu indispensable pour être libre. La courtoisie ainsi que la loyauté sont des qualités primordiales pour devenir un bon guerrier.");
    }
    else if (choice==2) {
        System.out.println("Le mage ne baisse jamais les bras quelles que soient les épreuves. Le savoir et la connaissance sont indispensables pour devenir mage.");
    }
    else if (choice==3) {
        System.out.println("Le voleur se moque des règles et doit faire preuve de rapidité pour ne pas se faire prendre.");
    }
    else if (choice==4){
        System.out.println("Le Prêtre utilise la magie blanche pour soigner ses alliés sur le champs de bataille. Ne sous estimez pas sa puissance lorsqu'il est dans une situation délicate, les dieux choisissent toujours la personne la plus pieuse à aider.");
    }
else{
    System.out.println("Cette classe n'existe pas. Recommencez ");
    choice = ChooseClass();

}    
    return choice ;
}    
}
