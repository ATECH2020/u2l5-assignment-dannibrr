import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      //creating a scanner object "scan"
    Scanner scan = new Scanner(System.in);
    //declaring variables that will be later used in the program
    //and initlizaing variables that have constant values
    double lumberCost = 8.0;
    double windowCost = 11.0;
    double total, taxes; 
    int numBoards, numWindows;
    
    //asking the user a series of questions in order to initlize my variables 
    System.out.println("Enter the sales tax rate:");
    taxes = scan.nextDouble();
    System.out.println("How many boards do you need?");
    numBoards = scan.nextInt();
    System.out.println("How many windows do you need?");
    numWindows = scan.nextInt();

    //creates an object "con" from the construction class 
   //I will now be able to use methods within 
    Construction con = new Construction(lumberCost, windowCost,taxes);

    //using methods from the construction class to figure out my total
    //also prints the total for the user
    total = con.lumberCost(numBoards) + con.windowCost(numWindows);
    System.out.println("Total: " + total);

    //using the grandTotal method from the construction class to figure out the total + tax
    //also prints the grand total for the user

    System.out.println("Grand Total: " + con.grandTotal(total));


    }//ends the main method
}//ends the class 
