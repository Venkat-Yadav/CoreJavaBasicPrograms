package CoreBasics;

import java.util.Scanner;

public class JavaBasics1 {


	public void literals() {
	
	// Literals means any constant value that we are using in our program.
	
		int a=10, b=20; // Integer type literal 
		int c= a+b;
		System.out.println("The sum of a and b is:"+ c);
		
		float amount =8_50_884.56f;// we can use _ to seperate numbers insted of ,  
		
		double d= 124587.468d;// default value of decimal is double
		char ch='v';
		System.out.println(" the float value is :" +amount + '\n' +" double amount is:"+d);
		System.out.println("chareter is:"+ch);
		String name=" venkat"; // it is string literal, if it is double code its a string literal
		System.out.println(" My name is: "+name);
		
	
	}
	//---------------------------------------------------------------------------------------
public void expressionsWithOperetors() {
		
		float base,hight,area;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter base of triangle");
		base=sc.nextFloat();
		System.out.println(" Enter Hight of triangle");
		hight=sc.nextFloat();
		
		area=base*hight/2; // formula is half (1f/2f*base *hight) 
		System.out.println(" Area of triangale is: "+area);
		
		System.out.println(" Enter a  number");
		int a= sc.nextInt();
		int b=a++; // first assign value to b later it increment bz its post incremnet;
		System.out.println(" before assignment Post increment value of a is:" +b);
		System.out.println(" After assignment Post increment value of a is:" +a);
		
		System.out.println(" Enter a  number");
		int c= sc.nextInt();
		int d=++c; // first assign value to b later it increment bz its post incremnet;
		System.out.println(" before assignment pre increment value of c is:" +c);
		System.out.println(" After assignment Pre increment value of c is:" +d);
	
		char ch='A';
		System.out.println(" before pre increment value of char:" +ch);
		 ++ch;
		System.out.println(" after pre increment value is:" +ch);
		
		sc.close();
		
	}
//-------------------------------------------------------------------------------
	public void scanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name= sc.nextLine();
		
		System.out.println("enter id");
		int id= sc.nextInt();
		
		System.out.println("Enter Mobile Number");
		long number = sc.nextLong();
		
		System.out.println("enter True or false");
		boolean men= sc.nextBoolean();
		
		System.out.println(" ente your balance");
		double bal=sc.nextDouble();
		
		sc.close();
		System.out.println(" My id is: " +id + '\n' +" My Name is: " +name +'\n'+ " Mobile number is: "+ number);
		System.out.println(" Men: "+men +'\n' + "Balance : " + bal );
	
	}
	//------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		JavaBasics1 obj= new JavaBasics1();
		//obj.literals();
		//obj.expressionsWithOperetors();
		obj.scanner();
		
	}
}
