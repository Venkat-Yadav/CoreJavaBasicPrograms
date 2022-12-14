package CoreBasics;

public class RegularExpressions {
		
		void regularExpressions() {
		
		String str2="Venkat";
		String str3="&";
		String str1="Y";
		System.out.println(str3.matches("."));
		System.out.println(str2.matches("Venkat"));
		System.out.println(str1.matches("Y|6"));
		System.out.println(str1.matches("[aYen]"));
		System.out.println(str1.matches("[a-z,A-Z][0-9]"));
		
		// \d for digits, \D is not digit,
		// \s for space,/S not for Space, \w is either leter or number, \W is nither leter/number//
		
		System.out.println(str1.matches("\\w"));
		System.out.println(str1.matches("\\D"));
	
	
	String str5 = "venkat@gmail.com";
	int i= str5.indexOf("@");
	String username=str5.substring(0,i);
	String domain=str5.substring(i+1,str5.length());
	System.out.println(" Usernameis :"+username +'\n' + " domain is :"+domain);
	int j = domain.indexOf(".");
	String name=domain.substring(0,j);
	System.out.println(name);
	System.out.println(name.equals("gmail"));
	
	}
	
	void show() {
		
		String str="Venkat12@Yesalla&%76";
		String str2=" venkata   mallu";
		System.out.println(str.replaceAll("[^a-z,A-Z]",""));
		System.out.println(str2.replaceAll("\\s+", " " ));
		
		
	}
	
	public static void main(String[] args ) {
		RegularExpressions obj=new RegularExpressions();
		//obj.regularExpressions();
		obj.show();
			
	}
}
