import java.util.Scanner;

/**
 * C4e6
 */
public class C4e6 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Entrer le nom de la première personne");
    String firstUser = input.nextLine();
System.out.println("Entrer le score de " + firstUser);
int firstScore = input.nextInt();
input.nextLine();
System.out.println("Entrer le nom de la deuxième personne");
String secondUser = input.nextLine();
System.out.println("Entrer le score de " + secondUser);
int secondScore = input.nextInt();
input.nextLine();
String tempUser ;
int tempScore ;
if (secondScore > firstScore) {
    tempUser = firstUser ;
firstUser = secondUser ;
secondUser = tempUser ;
tempScore = firstScore ;
firstScore = secondScore ;
secondScore = tempScore ;
}
System.out.println("Entrer le nom de la troisième personne");
String thirdUser = input.nextLine();
System.out.println("Entrer le score de " + thirdUser);
int thirdScore = input.nextInt();
input.nextLine();
if (thirdScore > secondScore) {
    tempUser = thirdUser ;
thirdUser = secondUser ;
secondUser = tempUser ;
tempScore = thirdScore ;
thirdScore = secondScore ;
secondScore = tempScore ;
    }
    if (secondScore > firstScore) {
        tempUser = firstUser ;
    firstUser = secondUser ;
    secondUser = tempUser ;
    tempScore = firstScore ;
    firstScore = secondScore ;
    secondScore = tempScore ;
    }       
System.out.println("Entrer le nom de la quatrième personne");
    String fourthUser = input.nextLine();
    System.out.println("Entrer le score de " + fourthUser);
    int fourthScore = input.nextInt();
    input.nextLine();
    if (fourthScore > thirdScore) {
tempUser = fourthUser ;
fourthUser = thirdUser ;
thirdUser = tempUser ;
tempScore = fourthScore ;
fourthScore = thirdScore ;
thirdScore = tempScore ;       
        }
        if (thirdScore > secondScore) {
            tempUser = thirdUser ;
        thirdUser = secondUser ;
        secondUser = tempUser ;
        tempScore = thirdScore ;
        thirdScore = secondScore ;
        secondScore = tempScore ;
            }
            if (secondScore > firstScore) {
                tempUser = firstUser ;
            firstUser = secondUser ;
            secondUser = tempUser ;
            tempScore = firstScore ;
            firstScore = secondScore ;
            secondScore = tempScore ;
            }            
            System.out.println("Entrer le nom de la cinquième personne");
            String fifthUser = input.nextLine();
            System.out.println("Entrer le score de " + fifthUser);
            int fifthScore = input.nextInt();
            input.nextLine();
            if (fifthScore > fourthScore) {
                tempUser = fifthUser ;
                fifthUser = fourthUser ;
fourthUser = tempUser ;
tempScore = fifthScore;
fifthScore = fourthScore ;
fourthScore = tempScore ;
}
                if (fourthScore > thirdScore) {
                    tempUser = fourthUser ;
                    fourthUser = thirdUser ;
                    thirdUser = tempUser ;
                    tempScore = fourthScore ;
                    fourthScore = thirdScore ;
                    thirdScore = tempScore ;       
                            }
                            if (thirdScore > secondScore) {
                                tempUser = thirdUser ;
                            thirdUser = secondUser ;
                            secondUser = tempUser ;
                            tempScore = thirdScore ;
                            thirdScore = secondScore ;
                            secondScore = tempScore ;
                                }
                                if (secondScore > firstScore) {
                                    tempUser = firstUser ;
                                firstUser = secondUser ;
                                secondUser = tempUser ;
                                tempScore = firstScore ;
                                firstScore = secondScore ;
                                secondScore = tempScore ;
                                }                                    
            System.out.println("La première personne est " + firstUser + " avec un score de " + firstScore + ".");
System.out.println("La deuxième personne est " + secondUser + " avec un score de " + secondScore + ".");
System.out.println("La troisième personne est " + thirdUser + " avec un score de " + thirdScore + ".");
System.out.println("La quatrième personne est " + fourthUser + " avec un score de " + fourthScore + ".");
System.out.println("La cinquième personne est " + fifthUser + " avec un score de " + fifthScore + ".");
}
    

    
}