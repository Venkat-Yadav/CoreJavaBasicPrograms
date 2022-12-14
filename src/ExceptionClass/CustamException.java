package ExceptionClass;

 class  InvalidAge extends Exception{
		

		public String toString() { return " invalid age not eligible for vote"; }
		 
	
			/*
			 * public String getMessage() { return " invalid age"; }
			 */

}

public class CustamException {
	
	static void validate(int age) throws InvalidAge {
		//int age=14;
		/*
		 * try{ if (age<18) { throw new InvalidAge(); } else {
		 * System.out.println(" Eligible for vote"); } } catch(InvalidAge e) {
		 * System.out.println(e); }
		 */
		
		if(age<18) {
			throw new InvalidAge();
		}
		else {
			System.out.println("eligible for vote");
		}
	}
	
public static void main (String[] args) {
	try{
		validate(12);
	}
	catch(InvalidAge e)
	{
		//System.out.println(e.getMessage());
		System.out.println(e);// it will call tostrig mehtod internaly. 
		//e.printStackTrace();
	}
}
}
