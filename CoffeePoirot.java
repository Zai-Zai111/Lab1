import java.util.Scanner;

public class CoffeeOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] orders = new String[100];
        int orderCount = 0;
        
        System.out.println("Welcome to Coffee Poirot, Beika City!");
        System.out.println("Please choose from our menu:");
        
        System.out.println("\n1 - Coffee");
        System.out.println("2 - Tea");
        System.out.println("3 - Smoothie");
        System.out.println("4 - Exit (Checkout)\n");
        
        while (true) {    
            System.out.print("Enter your beverage: ");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                orders[orderCount++] = "Bitter but energizing!";
            } else if (choice == 2) {
                orders[orderCount++] = "Soothing and calming!";
            } else if (choice == 3) {
                orders[orderCount++] = "Cold and refreshing!";
            }else if (choice == 4) {
                System.out.println();
                for (int i=0; i < orderCount; i++) {
                    System.out.println(orders[i]);
                }
                System.out.println("\n Thank you for visiting Coffee Poirot!");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        sc.close();
    }
}
