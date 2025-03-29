import java.util.Scanner;
public class quiz{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
       
        String quiz = scanner.nextLine();
        System.out.println("Your answer: " +quiz);
        if (quiz.equalsIgnoreCase("Echo"))
        {
            System.out.println("Congratulations your answer is correct");
        }
        else {
            System.out.println("Incorrect... try again");
        }
        scanner.close();
    }    
    }
