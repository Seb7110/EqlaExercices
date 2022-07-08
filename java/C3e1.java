import java.util.Scanner;


/**
 * C3e1
 */
public class C3e1 {

    public static void main(String[] args) {
        Retro();
    
    
    }
    static void Retro(){
        System.out.println("Hello world");
        String gameName="Sonic";
        System.out.println("my favourite game is "+gameName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("gave me your favourite animal:");
        String favouriteAnimal = scanner.nextLine();
scanner.close();
System.out.println("your favourite animal is "+favouriteAnimal);
System.out.println("\007");

    
    }

}
