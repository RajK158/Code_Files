// Create a program using numbers 1 through 52 so we account for all 52 cards in a standard deck. 
// Card 32 is from another deck! Break the program if the deck reaches 32, and print 
// “An incorrect card was found in item 32.”
public class card {
    public static void main(String[] args){
        int c;
        for (c=1;c<=52;c++){
            System.out.println("Card no: "+c);
            if (c==32){
                System.out.println("Card "+c+" is from the another deck!");
                break;
               
            }
        }
    }
}
