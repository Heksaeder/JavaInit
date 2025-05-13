package TP2;

import java.util.Scanner;

public class ReverseCase {

    public ReverseCase() {
        // Lire string
        System.out.println("Entrez une string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Inverser casse de chaque caractère

        String reversedCase = "";
        for (int i = 0; i < str.length(); ++i) { // de i = 0 à length()
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                reversedCase += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                reversedCase += Character.toUpperCase(c);
            } else {
                reversedCase += c;
            }
        }

        // Affichage
        System.out.println("La string avec les casses inversées est: " + reversedCase);
    }
}
