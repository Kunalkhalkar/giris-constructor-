/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.
 */
 import java.util.*;
 public class StudManage{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollNo, name");
		int rollNo = sc.nextInt();
		String name = sc.next();
		System.out.println("Enter the marks of three subject");
		int marks[] = new int[3];
		for(int i =0; i<marks.length; i++){
			marks[i] = sc.nextInt();
		}
		Student s1 = new Student(rollNo, name, marks);
		s1.getTotal();
		
	}
 }
 
 class Student{
	 int rollNo;
	 String name;
	 int marks[];
	 int total;
	 
	 Student(int rollNo, String name, int ...marks){
		 this.rollNo = rollNo;
		 this.name = name;
		 this.marks = marks;
		 for(int i = 0; i<marks.length; i++){
			 total+=marks[i];
		 }
	 }
	 
	 void getTotal(){
		 System.out.println(total);
	 }
	 
 }