package TP2;

import java.util.Scanner;

public class MenuTP2 {
    public static void main(String[] args) {
        // Menu pour lancer TP2
        System.out.println("Choisissez une option:");
        System.out.println("1. Reverse string");
        System.out.println("2. Reverse case");
        System.out.println("3. Occurrences");
        System.out.println("4. Delete occurrences");
        System.out.println("0. Quitter");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                new ReverseString();
                break;
            case 2:
                new ReverseCase();
                break;
            case 3:
                new Occurrences();
                break;
            case 4:
                new DeleteOccurrences();
                break;
            case 0:
                System.out.println("Au revoir!");
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }
}
