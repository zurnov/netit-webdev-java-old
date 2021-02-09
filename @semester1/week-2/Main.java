import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desiredProduction= 7;
        int allStores = 10;

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " +name);

        System.out.println("Enter production rate for the day: ");
        int productionPerDay = scanner.nextInt();

        System.out.println("Desired production for all stores: " + (productionPerDay * allStores));

        System.out.println("What was the production rate yesterday: ");
        int productionYesterday = scanner.nextInt();

        System.out.println(("Is current production rate efficient: ") + (productionPerDay > productionYesterday));





    }
}
