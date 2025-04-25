import java.util.Scanner;

public class Hour {
    public Hour() {
        // Lire 3 entiers représentant une heure (hh:mm:ss) et afficher l'heure à la seconde suivante

        System.out.println("Entrez 3 entiers: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Heure (hh): ");
        int h = sc.nextInt();

        System.out.println("Minute (mm): ");
        int m = sc.nextInt();

        System.out.println("Seconde (ss): ");
        int s = sc.nextInt();

        // Valider l'heure
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Heure invalide.");
            return;
        }

        // Calculer la seconde suivante
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

        // Afficher le résultat
        System.out.println("La seconde suivante est: " + h + ":" + m + ":" + s);
    }
}
