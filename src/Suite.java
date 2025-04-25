import java.util.Scanner;

public class Suite {

    public Suite() {
        // Lire suite d'entiers terminée par 0 puis afficher nombre entiers, somme entiers, moyenne entiers
        int count = 0;
        int sum = 0;
        int entier;

        System.out.println("Entrez une suite d'entiers (quitter en entrant 0): ");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Entier n°" + (count+1) + ": "); // démarre le compteur à 1 et pas à 0
            entier = sc.nextInt();
            if (entier != 0) {
                count++;
                sum += entier;
            }
        } while (entier != 0);

        // Nombre entiers
        System.out.println("Nombre d'entiers: " + count); // -1 pour exclure le 0
        // Somme
        System.out.println("La somme est: " + sum);
        // Moyenne :
        if (count == 0) {
            System.out.println("Aucun entier n'a été entré.");
        } else {
            double avg = (double) sum / count; // somme/nombre entiers -1 (excl 0)
            System.out.println("La moyenne est: " + avg);
        }

    }
}
