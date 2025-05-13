package TP1;

import java.util.Scanner;

public class Average {

    public Average() {

        // Lire trois entiers et faire la moyenne des deux plus élevés
        System.out.println("Entrez 3 entiers: \n Entier n°1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Entier n°2: ");
        int b = sc.nextInt();

        System.out.println("Entier n°3: ");
        int c = sc.nextInt();

        // Avg des 2 plus élevés
        int min = Math.min(a, Math.min(b, c)); // min est le plus petit (comparaison de a à b et c, puis de b et c)
        int sum = a + b + c - min;

        double average = sum / 2.0;

        // Afficher le résultat
        System.out.println("La moyenne des deux plus élevés est: " + average);
    }
}
