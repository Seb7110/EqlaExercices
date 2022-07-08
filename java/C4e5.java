import java.util.Scanner;

/**
 * C4e5
 */
public class C4e5 {
static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        String pseudo =ChoosePseudo();
        
    }
    static String ChoosePseudo (){
        System.out.println("Choisissez votre pseudo ?");
String choice =input.nextLine();
if (choice.equals("Kraktu")){
    System.out.println("Espèce de voleur de pseudo !");
    }
    else if (choice.length() <=7) {
        System.out.println("Votre pseudo est court;");
}
    else if (choice.equals("Zamboyle")) {
        System.out.println("Johnny sort de ce corps !");
    }
    else {
        System.out.println("Votre pseudo est long.");
    }
    return choice;
    }
}