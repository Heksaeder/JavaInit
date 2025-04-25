import java.util.Scanner;

public class Somme {

    public Somme() {
        System.out.println("Entrez 2 entiers: \n Entier n°1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Entier n°2: ");
        int b = sc.nextInt();

        System.out.println("La somme de " + a + " et " + b + " est: " + (a + b));
    }
}