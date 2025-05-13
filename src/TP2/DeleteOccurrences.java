package TP2;

import java.util.Scanner;

public class DeleteOccurrences {
    public DeleteOccurrences() {
        // Lire caractère
        System.out.println("Entrez un caractère: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        sc.nextLine();

        // Lire string
        System.out.println("Entrez une string: ");
        String str = sc.nextLine();

        // Supprimer occurrences du caractère dans string
        String result = "";
        for (int i = 0; i < str.length(); ++i) { // de i = 0 à length()
            if (str.charAt(i) != c) {
                result += str.charAt(i);
            }
        }
        // Affichage
        System.out.println("La string sans le caractère '" + c + "' est: " + result);
    }
}
