import java.util.Scanner;

public class Penguin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of coins you have: ");
        double coin = scanner.nextDouble();
        System.out.println("You have " + coin + " coins");
        double usd = coin * 0.0045;
        System.out.println("Total amount: $" + usd + " USD.");
        scanner.close();
    }
}

// Club Penguin is a flash game from the early 2010s that rose to popularity and became one of the biggest computer games! In the game, you were a penguin that waddled around the world with friends and socialized. 🐧
// The in-game currency in Club Penguin was coins, where you could buy items and gain coins by playing mini-games and completing missions.
// In our challenge,
// 1 coin in Club Penguin is equal to $0.0045 USD.
// Create a program that serves as a conversion calculator, where a penguin can enter the number of coins they have, and it will return how much money they have in USD!