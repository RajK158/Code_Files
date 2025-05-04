// import java.util.HashSet;
// import java.util.*;
// public class hashset{
// public static void main(String[] args){
// Scanner sc= new Scanner(System.in);
// int [] 
// } 

// }
import java.util.*;  // For Scanner and HashSet

public class ContainsDuplicateChecker {

    public static void main(String[] args) {
        // Step 1: Set up scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask user for array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Step 3: Initialize the array
        int[] nums = new int[size];

        // Step 4: Prompt the user to enter each number
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Step 5: Call the function to check for duplicates
        boolean hasDuplicates = containsDuplicate(nums);

        // Step 6: Print the result
        if (hasDuplicates) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array does not contain duplicates.");
        }

        scanner.close();
    }

    // Step 7: The method to check for duplicates (same logic as your LeetCode solution)
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
