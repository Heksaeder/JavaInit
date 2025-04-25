import java.util.Scanner;

public class SumAvg {

    public SumAvg() {
        int sum = 0;

        // Lire 10 entiers, calculer somme puis moyenne
        System.out.println("Entrez 10 entiers: ");
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.print("Entier n°" + (i + 1) + ": ");
            int entier = sc.nextInt();
            sum += entier;
        }

        double avg = sum / 10.0;

        // Résultat
        System.out.println("La somme est: " + sum);
        System.out.println("La moyenne est: " + avg);

    }
}
