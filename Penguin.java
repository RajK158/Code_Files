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
