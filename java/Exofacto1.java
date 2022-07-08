import java.util.Scanner;

/**
 * Exofacto1
 */
public class Exofacto1 {
static Scanner input = new Scanner (System.in);

public static void main(String[] args) {
    int numbers = ChooseNumber() ;
    
}
static int ChooseNumber () {
    System.out.println("Entrez un nombre entié");
    int firstChoice = input.nextInt();
    System.out.println("Entrez un nombre entié");

    int secondChoice = input.nextInt() ;
return choice (firstChoice, secondChoice) ;

}
    
}