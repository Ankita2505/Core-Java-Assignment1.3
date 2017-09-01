package TruthTable;
//Program to compare the truth table of Bitwise AND and Logical AND and print result of one case.
import java.util.Scanner;  //importing scanner class

public class TruthTable {
	public static void main(String[] args) //Start of main method
	{
		// TODO Auto-generated method stub
		int x,y; 
        Scanner sc = new Scanner(System.in); //creating objects of scanner class
        System.out.print("Enter the Value of x : "); //user input for 1st variable
        x=sc.nextInt(); 
        System.out.print("Enter the Value of y : "); //user input for 2nd variable
        y=sc.nextInt(); 
        // Bitwise AND operator &
     	System.out.println("Result of Bitwise AND  is " +(x & y));
     	// Logical AND operator &&
     	/*
     	 System.out.println("Result of Logical AND is" +(x>y && x<y));
     	System.out.println("Result of Logical AND is" +(x>y && x==y));
     	System.out.println("Result of Logical AND is" +(x==y && x<y));
     	*/
	} //closing of main method
}  // closing of class
