import java.util.Scanner;
// Très bonne solution avec tes connaissances actuelles. Cependant, j'ai quelque chose de plus efficace à te proposer. On peut se dire ceci :
// Si la personne met 7, elle a raison
// Si la personne ne met pas 7, elle a tort.
// Donc il y a 2 autres possibilités que tu as fait qui sont un peu plus efficace. La première est celle-ci :
//if (choice==7) {
//    System.out.println("bien joué !");
//}
// if (choice!=7) {
//     System.out.println("Pfff, tu t'es planté. Tout le monde sait que mon manga préféré comporte 7 volumes.");    
//     }
// Le deuxième if voulant dire "Si choice est DIFFERENT de 7".
// Enfin, et personnellement la meilleure solution que j'aurais à proposer ici :
//if (choice==7) {
//    System.out.println("bien joué !");
//}
// else {
//     System.out.println("Pfff, tu t'es planté. Tout le monde sait que mon manga préféré comporte 7 volumes.");    
//}
// else voulant dire "Sinon". Donc on a en fait "Si choice vaut 7 alors je fais ceci, sinon je fais cela". Le else comprends tous les cas n'ayant pas été pris en compte par le dernier if déclaré !

// C'est super en tout cas ce que tu as fait, surtout que tu as fait ça dans une fonction avec les bons types de donnée, franchement bravo, et maintenant tu as 2 nouvelles cordes à ton arc pour la suite des exos ! :)
public class c4e2 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int volume=NombreDeVolume();
        
    }
    static int NombreDeVolume(){    
        System.out.println("Combien de volume comporte mon manga préféré ?");
        int choice=input.nextInt();
if (choice<7) {
System.out.println("Pfff, tu t'es planté. Tout le monde sait que mon manga préféré comporte 7 volumes.");    
}
if (choice==7) {
    System.out.println("bien joué !");
}
if (choice>7) {
    System.out.println("Pfff, tu t'es planté. Tout le monde sait que mon manga préféré comporte 7 volumes.");
    }
    return choice ;
}

    }
