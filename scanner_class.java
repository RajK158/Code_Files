import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        // Write your code here 💖
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter you ID number: ");
        int num = scanner.nextInt();
        System.out.println("Name: " +name+ " ID: " +num);
        System.out.println("Data added succesfully");
        scanner.close(); 
    }
}
// The scanner object: Scanner scanner = new Scanner(System.in); sets up the scanner to read input from the user.

// In our program example, we used the scanner.nextLine() method to read strings, but we can also use

// scanner.nextDouble()
// scanner.nextBoolean()
// scanner.nextInt()