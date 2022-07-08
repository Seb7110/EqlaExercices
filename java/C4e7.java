import java.util.Scanner;

public class C4e7 {
static Scanner input =new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Afin de savoir si vous pouvez passer le permis, indiquer votre âge");
    int age =input.nextInt();
 String str = age > 18 ? "Vous pouvez passer le permis."  : "Vous ne pouvez pas passer le permis.";
System.out.println(str);

        }
}
