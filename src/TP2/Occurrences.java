package TP2;

import java.util.Scanner;

public class Occurrences {
    public Occurrences() {
        // Lire caractère
        System.out.println("Entrez un caractère: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        sc.nextLine();

        // Lire string
        System.out.println("Entrez une string: ");
        String str = sc.nextLine();
        int count = 0;

        // Compter occurrences (case sensitive + accents comptabilisés)
        for (int i = 0; i < str.length(); ++i) { // de i = 0 à length()
            if (str.charAt(i) == c) {
                count++;
            }
        }

        // Affichage
        System.out.println("Le caractère '" + c + "' apparaît " + count + " fois dans la string.");
    }
}
