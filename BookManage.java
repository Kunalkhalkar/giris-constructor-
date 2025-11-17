/*Q5. Problem:
 Create a class Book with fields:
bookId, title, author, and price.
Use:
A default constructor to print “Book object created”.
A parameterized constructor with bookId and title.
Another parameterized constructor with bookId, title, author, and price
 that calls the previous constructor using this() (constructor chaining).
Add a method display() to show book details.
Hint:
 Use this(bookId, title) inside the main constructor to reuse initialization logic.
Explanation:
 This question checks understanding of constructor chaining, which helps avoid code duplication inside multiple constructors.
 */
 import java.util.*;
 public class BookManage{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book id, title, author, price");
		int id = sc.nextInt();
		String title = sc.next(),author = sc.next();
		double price = sc.nextDouble();
		Book b1 = new Book(id, title, author, price);
		b1.display();
		
	}
 }
 class Book{
	 private int bookId;
	 private String title, author;
	 private double price;
	 
	 Book(){
		 System.out.println("book Object created");
	 }
	 Book(int bookId, String title){
		 this();//calls the previous constructor using this()(constructor chaining).
		 this.bookId = bookId;
		 this.title = title;

	 }
	 
	 Book(int bookId, String title, String author, double price){
		 this(bookId, title);
		 this.author = author;
		 this.price = price;
	 }
	void display(){
		System.out.println(bookId +"\t"+ title +"\t"+ author +"\t"+ price +"\t");
	}
 }