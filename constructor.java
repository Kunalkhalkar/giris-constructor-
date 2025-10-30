/*
constructor start
 - constructor is a function with the same name as classname but without return type.
 -  constructor get executed when we create object of class
 - types
	* Default constructor. 
	* Parameterized constructor. 
	* Overloaded constructor. 
	* this() constructor. 

*/
import java.util.*;
public class constructor{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of variable");
		int n = sc.nextInt();
		square sq = new square();// example of default constructor
		sq.calSquare(n);
	}
}
class square{
	void calSquare(int n){
		System.out.println("Square is : "+ n*n);
	}
}