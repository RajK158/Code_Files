public class ticket {
    public static void main(String[] args){
        boolean isLatte = true;
        boolean isIced = false;
        boolean withMatcha = true;
        int itemsOrdered = 1;
        int vanillaPumps = 3;
if(isLatte && isIced){
    System.out.print("Espresso, Milk, Ice, Syrup. ");
}
else if(isLatte && withMatcha){
    System.out.println("Macha, Oat milk,Ice, Vanilla");
}
else if(isLatte){
    System.out.println("Espresso, Steamed Milk");
}
else {
    System.out.println("Select a drink to get started!");
}
if (itemsOrdered > 1){
    System.out.println("Provide a cup holder");
}
if (vanillaPumps >= 2){
    System.out.println("Charge $1 for extra vannila");
}
    }
}


// Let's create a ticket automation system so that you can get the list of ingredients for each drink, depending on the order.

// Create the boolean variables isLatte, isIced, and withMatcha.
// Create the integer variables itemsOrdered and vanillaPumps.
// First, create an if/else statement that follows the order below:

// If a customer orders an iced latte, print “espresso, milk, ice, syrup.”
// Otherwise, If a customer orders a latte with matcha, print “matcha, oat milk, ice, vanilla.”
// Otherwise, If a customer orders a latte, print “espresso, steamed milk.”
// Otherwise, print “Select a drink to get started!”
// Create another if statement with the following condition:

// If a customer orders more than 1 item, print “provide cup holder”
// Create your last if statement with the following conditions:

// If a customer orders 2 or more pumps of vanilla, print “charge $1 extra”.
// Here's a sample ticket to provide values for your variables.



// “Hi, it's so cold outside! Winter is here, isn't it? Can I please get a nice warm matcha latte? Can you add 3 pumps of vanilla to that? Thanks!”