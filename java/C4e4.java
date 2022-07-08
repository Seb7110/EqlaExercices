import java.util.Scanner;

public class C4e4 {
    static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
        int destination=ChooseDestination();
    }
    static int ChooseDestination () {
        System.out.println("Choisissez votre destination \n 1 - Bruxelles \n 2 - Mons \n 3 - Nivelles \n 4 - Charleroi");
        int choice=input.nextInt();
        if (choice==1) {
            System.out.println("Bien, vous avez choisi d'aller à Bruxelles.");
            ChoosePeriode("10h33", "14h42", "19h02");
            
        }
        else if (choice==2) {
            System.out.println("Bien, vous avez choisi d'aller à Mons.");
            ChoosePeriode("9h10", "13h30", "22h56");
        }
        else if (choice==3) {
            System.out.println("Bien, vous avez choisi d'aller à Nivelles.");
            ChoosePeriode("5H34", "15h13", "20h");
            
        }
        else if (choice==4) {
            System.out.println("Bien, vous avez choisi d'aller à Charleroi.");
            ChoosePeriode("7h45", "12h53", "23h02");
            
        }
        else {
            System.out.println("Entrée incorrecte. Veuillez recommencer");
            choice = ChooseDestination();
        }
        return choice;
    }
    static int ChoosePeriode(String _matin, String _midi, String _soir){
        System.out.println("Choisissez la période \n 1 - matin \n 2 - midi \n 3 - soir");
        
        int choice =input.nextInt();
        if (choice==1) {
            System.out.println("Le train partira à " +_matin + ". Bon voyage");            
        }
        else if  (choice==2) {
            System.out.println("Le train partira à " + _midi  + ". Bon voyage"); 
            ;
        }                
        else if (choice==3){
            System.out.println("Le train partira à "+ _soir + ". Bon voyage");
        }  
        else {
            System.out.println("Entrée incorrecte. Veuillez recommencer ");
            choice = ChoosePeriode(_matin, _midi, _soir) ;
        }
        return choice ;
        
        
        
        
    }   
}
