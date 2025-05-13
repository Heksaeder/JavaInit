package TP2;

import java.util.Scanner;

public class ReverseString {
    public ReverseString() {
        // Lire string
        System.out.println("Entrez une string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Inversion string
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; --i) { // Fin de string → décrémentation i avant 0
            reversed += str.charAt(i);
        }

        // Affichage
        System.out.println("La string inversée est: " + reversed);
    }
}
