package ExceptionClass;

import java.io.FileInputStream;
import java.util.Scanner;


public class ResourcesDemo {
static FileInputStream fi;
static void devide() throws Exception{
	fi = new FileInputStream("C:\\Users\\venkat\\Documents\test1.txt");
	Scanner sc=new Scanner(fi);
	int a= sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println(a/b);
}



public static void mian (String[] args) throws Exception {
	
devide();
}
}
