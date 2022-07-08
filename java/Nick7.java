import java.util.Scanner;

/**
 * Nick7
 */

public class Nick7 {
static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        String myNick=ChooseNick();
}
    static String ChooseNick()
    {
        System.out.println("Entrez votrre pseudo");
String choice =input.nextLine();
choice = choice.substring(0,1).toUpperCase() + choice.substring(1).toLowerCase();
    if (choice.length() ==7) 
{
        System.out.println("Bravo ! Votre pseudo sera " + choice);
}
else if (choice.equals("Kraktu")){
    System.out.println("Espèce de voleur de pseudo !");
    }
else if (choice.equals("Rolly")){
    System.out.println("Je comptais vous tuer rapidement. Par balles. Ou à coups de neurotoxines. \n Mais si vous le prenez sur ce ton, je vous préviens, je vais y aller petit à petit.");
    }
    else if (choice.equals("Zamboyle")) {
        System.out.println("Johnny, sors de ce corps !");
    }
    else if (choice.length() >=7) {
        System.out.println("Votre pseudo est trop long, il doit faire 7 caractères");
}
    else {
        System.out.println("Votre pseudo est trop court, il doit faire 7 caractères.;");
    }
    return choice;
    }
}