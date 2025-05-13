package TP1;

import java.util.Scanner;

public class Currency {
    public Currency() {
        // Lire somme en dollars
        System.out.println("Entrez la somme en dollars (décimale avec une virgule): ");
        Scanner sc = new Scanner(System.in);
        double dollars = sc.nextDouble();

        // Lire le taux de change
        System.out.println("Entrez le taux de change: ");
        double taux = sc.nextDouble();

        // Calculer la somme en euros
        double euros = dollars * taux;

        // Afficher le résultat
        System.out.println("La somme en euros est: " + euros);
    }
}
