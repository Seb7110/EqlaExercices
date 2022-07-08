import java.util.Scanner;

/**
 * Harry
 */
public class Harry {
public static void main(String[] args) {
    Scanner inputChecker = new Scanner(System.in);
    System.out.println("Dans quelle maison de Poudlard souhaiterais-tu être envoyé ?");
    String maisonPoudlard = inputChecker.nextLine();
    inputChecker.close();
System.out.println("Tu veux aller à " + maisonPoudlard.toUpperCase());
System.out.println("Mais tu es un sale moldu, les grands mages parlent couramment le Java !");
}
    
}