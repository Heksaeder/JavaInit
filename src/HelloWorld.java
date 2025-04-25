import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        // Menu pour lancer Somme ou Currency
        System.out.println("Choisissez une option:");
        System.out.println("1. Currency");
        System.out.println("2. Somme");
        System.out.println("3. Average");
        System.out.println("4. Hour");
        System.out.println("5. SumAvg");
        System.out.println("6. Suite");
        System.out.println("0. Quitter");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                new Currency();
                break;
            case 2:
                new Somme();
                break;
            case 3:
                new Average();
                break;
            case 4:
                new Hour();
                break;
            case 5:
                new SumAvg();
                break;
            case 6:
                new Suite();
                break;
            case 0:
                System.out.println("Au revoir!");
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }
}