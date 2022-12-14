package ExceptionClass;

import java.util.Scanner;

public class Demo1 {
	
	public void method1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	try {
		int z=a/b;
		System.out.println(" Division is: "+z);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally{
		sc.close();
		System.out.println(" it is finally block is executed irrecspective of error");
	} 
	
}
	
	public  void multiCatchBlock() {
		int a[]= {10,5,0,12,3,8,6};
		
		try {
			int z=a[3]/a[5];
			System.out.println("Division is: "+z);
			System.out.println("5th index value is: " +a[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("inalid index");
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Bye");
		}
		
	}
	public static void main (String[] args) {
	
		Demo1 obj1=new Demo1();
		//obj1.method1();
		obj1.multiCatchBlock();
	}
	
	
}
