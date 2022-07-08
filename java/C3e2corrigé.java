import java.util.Scanner;


// Globalement c'est bien, car tu as trouvé tes 4 méthodes différentes et elle sont presque bonnes, regarde les corrections plus en détail pour les explications !
public class C3e2 {
    public static void main(String[] args) {

        Surprenant("Bonjour");
        // Ca c'est bon !
        String musicName = "music";
        Surprenant(musicName);
        // Ca ce n'est pas bon à cause des guillemets, si on fait appel à la variable musicName, on ne met surtout pas des guillemets, sinon ton transforme musicName en chaîne de caractère et donc on va écrire musicName! Hors, notre but et d'aller chercher le contenu de musicName !
System.out.println("What's your favourite song ?");
Scanner input = new Scanner(System.in);
Surprenant( +input.nextLine());
// Ca c'est bon, et c'est le plus donc, donc cool ! Par contre, à quoi servent les guillemets ? dans ton appel de surprenant ? 

System.out.println("What's your favourite instrument ?");
String favouriteInstrument = input.nextLine();
// Attention !! Ton Scanner pour choper la nextLine s'appelle favouriteSong ! Il aurait d'ailleurs du plutôt s'appeler scanner ou input, ça aurait été plus clair, car certes, dans le premier cas, ce scanner permet de récupérer la chanson préférée de l'utilisateur, mais dans le deuxième cas, non, il est là pour récupérer son instrument préféré, donc ton scanner devrait avoir un rôle plus neutre. De toute façon son rôle est de récupérer une information mais pas de la stocker ! Par contre le nom de ta String est bon, car en effet, c'est une string qui stocke l'instrument préféré de l'utilisateur. 

Surprenant("" + input);
input.close();
// Ici tu as donc une fautes qui découle du fait que tu utilise favouriteInstrument comme un scanner alors que c'est une string, il aurait de nouveau fallu bien appeler favouriteSong, et même, mieux, carrément appeler ton scanner autrement encore une fois, ça aurait été plus clair et moins troublant pour toi.

    }
    static void Surprenant(String phrase){
System.out.println(phrase +"!");    }
}
