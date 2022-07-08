import java.util.Scanner;

/**
* C3e7
*/
public class C3e7 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Entrer le premier nombre");
        int firstNumber=input.nextInt();
        System.out.println("Entrer le deuxième nombre");
        int secondNumber=input.nextInt();
        int firstOperation=Adition(firstNumber, secondNumber);
        int secondeOperation=soustraction(firstNumber, secondNumber);
        int thirdOperation=Multiplication(firstNumber, secondNumber);
        int fourthOperation=Division(firstNumber, secondNumber);
        int fifthOperation=Exposant2(firstNumber, secondNumber);
        
        
    }
    static int Adition(int firstNumber, int secondNumber){
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber+secondNumber));
        return firstNumber+secondNumber;
    }
    static int soustraction(int firstNumber, int secondNumber){
        System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber-secondNumber));
        return firstNumber-secondNumber;
        
    }
    static int Multiplication(int firstNumber, int secondNumber){
        System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber*secondNumber));
        return firstNumber*secondNumber;
    }
    static int Division(int firstNumber, int secondNumber   ){
        System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber/secondNumber));
        return firstNumber/secondNumber;
    }
    static int Exposant2(int firstNumber, int secondNumber){
        System.out.println(firstNumber + "*" + firstNumber + "=" + (firstNumber*firstNumber));
        System.out.println(secondNumber + "*" + secondNumber + "=" + (secondNumber*secondNumber));
        return firstNumber*firstNumber + secondNumber*secondNumber;
        
    }
    
    
}