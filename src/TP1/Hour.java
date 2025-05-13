package TP1;

import java.util.Scanner;

public class Hour {
    public Hour() {
        // Lire 3 entiers représentant une heure (hh:mm:ss) et afficher l'heure à la seconde suivante

        System.out.println("Entrez 3 entiers: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Heures (hh): ");
        int h = sc.nextInt();

        System.out.println("Minutes (mm): ");
        int m = sc.nextInt();

        System.out.println("Secondes (ss): ");
        int s = sc.nextInt();

        // Valider l'heure
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Heure invalide.");
            return;
        }

        // Incrémentation seconde
        s++;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }

        // Afficher le résultat (+ formatage)
        String formattedTime = String.format("%02d:%02d:%02d", h, m, s);
        System.out.println("L'heure suivante est: " + formattedTime);
    }
}
