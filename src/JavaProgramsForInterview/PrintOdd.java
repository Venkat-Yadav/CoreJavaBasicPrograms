package JavaProgramsForInterview;

import java.util.Scanner;

public class PrintOdd {

	void printodd() {
		int a[]= new int[5];
		//int b[]= {10,15,6,8,9};
		Scanner sc=new Scanner(System.in);
		/*
		 * System.out.println(" Enter any 4 numbers"); a[0]=sc.nextInt();
		 * a[1]=sc.nextInt(); a[2]=sc.nextInt(); a[3]=sc.nextInt();
		 */int k=1;
			for(int i=0;i<a.length;i++) {
			a[i]=k;
			k++;
			//System.out.println(a[i]);
			if(a[i]%2==0) {
				System.out.println(a[i] +" is even");
			}
			else
				System.out.println(a[i] +" is odd");
		
		}
		/*
		 * for (int i=0;i<a.length;i++) { //if((a[i]%2==0)|| (a[i]/2==1))
		 * System.out.println(a[i]);
		 * 
		 * }
		 */
	sc.close();
	}
public static void main(String[] args) {
	PrintOdd obj= new PrintOdd();
	obj.printodd();
}
}
