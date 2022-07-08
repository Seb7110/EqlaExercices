import java.util.Scanner;

/**
 * C3e2
 */
public class C3e2 {
public static void main(String[] args) {
    Ponctuation("Bonjour à tous");
String instrumentPréféré="piano";
Ponctuation(instrumentPréféré);
System.out.println("Quel est votre animal préféré ?");
Scanner input =new Scanner(System.in);
String animal=input.nextLine();
Ponctuation(animal);
System.out.println("Quel est votre sport préféré ?");
String sport =input.nextLine();
Ponctuation(sport);
input.close();


}
static void Ponctuation (String phrase){
System.out.println(phrase + "!");
}
    
}