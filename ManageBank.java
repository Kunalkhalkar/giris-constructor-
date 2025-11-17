/*Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000
A parameterized constructor to initialize all fields
A method deposit() to add money
A method display() to show details.
Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
*/
import java.util.*;
public class ManageBank{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account Number and name");
		int accNo = sc.nextInt();
		String name = sc.next();
		BankAccount ba = new BankAccount(accNo, name);
		System.out.println("Enter the deposit value");
		double deposit = sc.nextDouble();
		ba.deposit(deposit);
		ba.display();
	}
}

class BankAccount{
	protected int accNo;
	protected String name;
	protected double balance;
	
	BankAccount(){
		balance = 1000;
	}
	BankAccount(int accNo, String name){
		this();
		this.accNo = accNo;
		this.name = name;
	}
	
	void deposit(double deposit){
		if(balance > deposit){
		balance -= deposit;
		}
		else{ 
			System.out.println("insufficient balance");
		}
	}
	
	void display(){
		System.out.println(accNo+"\t"+name+"\t"+balance);
	}
}