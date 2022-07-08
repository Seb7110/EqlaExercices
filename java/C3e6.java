import java.util.Scanner;

/**
* C3e6
*/
public class C3e6 {
    static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
        int age=ChooseAge();
        
        System.out.println("Dans 17 ans, vous aurez " + age);
    }
    static int ChooseAge(){
        System.out.println("Quel âge avez-vous ?");
        int age=input.nextInt();
        System.out.println(age + "+" + 17 + "=" + (age+17));
        return age+17;
    }
    
    
}