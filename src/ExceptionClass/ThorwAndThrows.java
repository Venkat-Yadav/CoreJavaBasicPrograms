package ExceptionClass;

class negativDimension extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return " Negative numbers dimension";
	}
}

public class ThorwAndThrows {
	
	public static  int  divide(int a, int b) throws negativDimension {
		if (a<0 || b<0)
			throw new negativDimension();
		return a/b;
	}
	
	
	
	  public static int area(int a, int b) throws negativDimension { if(a<0 || b<0)
	  { throw new negativDimension(); } return a*b; }
	 
	
public static void Arithmetic() throws negativDimension {
	
	System.out.println(area(2,5));
	System.out.println(divide(10,0));
	
}

public static void main(String[] args) {
	
	
	  try { area(10,5); } catch(negativDimension e) { System.out.println(e); }
	 
		
		try {
			Arithmetic();
		} catch (negativDimension e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
	

}


}
