import java.util.Scanner;

/**
* c4e1
*/
public class c4e1 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int hour=ChooseHour();
        int minute=ChooseMinute();
        System.out.println("Il est "+hour+" heure "+minute+" minute. Bonne journée");
        
        
    }
    static int ChooseHour(){
        System.out.println("Entrer une heure");
        int choice=input.nextInt();
        
        if (choice<0) {
            System.out.println("erreur, Veuillez entrer une valeur comprise entre 0 et 23 ");    
        }
        if (choice >23){
            System.out.println("erreur, Veuillez entrer une valeur comprise entre 0 et 23 ");
        }
        
        
        
        return choice;
    }
    
    static int ChooseMinute(){
        System.out.println("Entrer les minutes");
        int choice=input.nextInt();
        if (choice<0){
            System.out.println("erreur, Veuillez entrer une valeur comprise entre 0 et 59.");
        }
        if (choice>59) {
            System.out.println("erreur, Veuillez entrer une valeur comprise entre 0 et 59.");
            
        }
        
        
        return choice;
        
    }
    
    
    
}