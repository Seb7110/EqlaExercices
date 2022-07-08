import java.util.Scanner;

public class C3e6 {
    public static void main(String[] args) {
Age("Dans 17 Ans, tu auras ");
// Ici tu appelles Age avec une string alors qu'elle attends un int


    }
    static void Age(int x)return{
        //le return est une instruction qui doit se trouver DANS la fonction, et suivra la valeur renvoyé par cette fonction. Par exemple si tu veux renvoyer age + 17 tu fais return ageNumber+17; (car ton age sera stocké dedans dans ton cas.)
        // Attention, tu déclare en paramètre un int qui s'appelle x, hors tu n'en a pas besoin ici, toute les informations dont la fonction a besoin se trouvant en elle même
        // Attention, tu déclare static void Age, hors void est la valeur de retour de la fonction, hors on va espérer qu'elle renvoie une int, donc on écrit static int Age()
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you ?");
        String AgeNumber = input.nextLine();
        // Ici on veut récupérer un âge, donc une int, donc on peut déclarer un int plutôt qu'un string et appeler la fonction Scanner.nextInt(); (dans ton cas, ton Scanner s'appelle input, donc input.nextInt();)
        input.close();
        System.out.println(ageNumber + "+" + 17 + "=" +(AgeNumber+17));
        // Il te manque donc le return qui devrait se retrouver ici, donc return ageNumber+17; pour que le Main() puisse accéder à cette information.
    }


}

// Avec toute ces informations, tu devrais pouvoir arriver à un résultat qui s'approche de ça :
public class C3e6 {
    public static void main(String[] args) {
    int futurAge = Age();
    // Cette instruction nous permet de stocker la valeur de retour de la fonction Age (donc ce qui se trouve dans le return).
    System.out.println("In 17 year you'll be " + futurAge);
    // On écrit la phrase que l'on veut
    }

    static int Age(){
        // j'ai mis static int car la fonction va renvoyer un chiffre à la fonction principale
        int userAge=24;
        // Ici j'ai déclaré un chiffre directement, à toi de mettre ce qu'il faut !
        return userAge+17;
        // Cette ligne dit que je vais renvoyer userAge + 17 à mon programme principal, celui qui l'appelle. C'est sa valeur de retour. En quelque sorte, Age() vaut userAge+17.
    }
}

