package CoreBasics;

public class JavaStringClass {
	
	public void stringMethods() {
		/*
		 * int length(); String toLowerCase(); String toUpperCase(); String trim();
		 * String substring(int begin); String substring(int begin,int end); String
		 * replace (char old, char new); boolean startsWith(String s); boolean
		 * endsWith(String s); char charAt(int index); int indexOf(String s); int
		 * lastIndexOf(String s); boolean equals(String s); boolean
		 * equalsIgnoreCase(String s); int compareTo(String s); string valueOf(int i);
		 */
		
		/*
		 * String str1= "    Venkat Yesalla"; int l= str1.length();
		 * System.out.println("length of string is: "+l); str1 =str1.toLowerCase();//
		 * when ever we are trying to change content of string it is create new object
		 * in heap with new content. System.out.println(str1);
		 * str1=str1.toUpperCase().trim();// trim() method removes the spaces before and
		 * after the string but not the middle space; System.out.println(str1);
		 * 
		 * String sub= str1.substring(6,9); System.out.println(" the sub string is:"
		 * +sub);
		 * 
		 * str1=str1.replace('Y','E'); System.out.println(str1); char
		 * ch2=str1.charAt(5); System.out.println(ch2); int index =str1.indexOf('Y');
		 * System.out.println(index);
		 */
		
		   
        String str1="Pyramid";
        String str2="pyramid";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);
        
        System.out.println(str1.compareTo(str2)); // it compares to strings and will give str1 is big it gives +ve values  if it small it gives -ve values.
        /*
        //String str1="pyramid";
        
        String str1="china wall";
        String str2=new String("china tall");
        
        //System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        */
        
        
        String str8="the great wall ";
        String str9="of china";
        System.out.println(str8.contains("wall"));
        System.out.println(str8.concat(str9));//System.out.println(str1 + str2);
        
    }
    

	
	
	
		public void stringObjects() {
	 //---converting char array to string 
	 char ch[]= {'v','e','n','k','a','t'};
	 String st1 =new String(ch,1,3);
	 System.out.println(" the string is: " +st1);
	 
	 byte b[]= {65,75,84,69,85};
	 String st9= new String(b);
	 System.out.println(st9);
	 //-----------------------------------
	 String st2=new String("JavaProgram");
	 String st4= "Java";
	 String st3=new String("Java");
	 String st5= "Java";
	 System.out.println(st3==st4);
	 System.out.println(st2==st3);
	 System.out.println(st2.hashCode());
	 System.out.println(st3.hashCode());
	 System.out.println(st4.hashCode());
	 
	 //----difference between .equels() and == method --------------
	 if(st5==st4) {
		 System.out.println("== is used to reference comperision");
	 }
	 else {
		 System.out.println("it is content comparesion");
	 }
	 
	 if (st2.equals(st4)) {
		 System.out.println("it is for content comparison");}
		 else {
			 System.out.println("it is for reference comparision");
	 }
		}
	//------- Why string is immutable & why string buffer & builder is mutable ---ex with concat and append methds-------------
	 
	 
		public static void main(String[] args) {
			
		JavaStringClass obj=new JavaStringClass();
		//obj.stringObjects();
		obj.stringMethods();
	 
		}

}
