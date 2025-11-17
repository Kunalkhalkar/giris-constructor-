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
		double price = sc.nextDouble();
		Product p1 = new Product(id, name, price);
		Product p2 = new Product(p1);
		
		System.out.println(p1.id+"\t"+p1.name);
		System.out.println(p2.id+"\t"+p2.name);
	}
 }
 class Product{
	 protected int id;
	 protected String name;
	 protected Double price;
	 
	 Product(int id, String name, Double price){//normal constructor 
		this.id = id;
		this.name = name;
		this.price = price;
		
	 }
	 
	 Product(Product p){//copy constructor (used to copy one object to another)
		 this.name = p.name;
		 this.id = p.id;
		 this.price =p.price;
	 }
	 
 }