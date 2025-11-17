/*Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
A parameterized constructor to initialize product details.


A copy constructor to copy data from another object.
 Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
 */
 import java.util.*;
 public class ManageProduct{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id, name, price");
		int id = sc.nextInt();
		String name = sc.next();
		int price = sc.nextInt();
		
		
	}
 }
 class Product{
	 protected int id;
	 protected String name;
	 protected Double price;
	 
	 Product(int id, String name, Double price){
		this.id = id;
		this.name = name;
		this.price = price;
	 }
 }