package recursions;


public class Reverese {
 
	public static void main(String[] args) {
		string ex=new string();
		String result1=ex.reverseString("hello");
		System.out.println(result1);
		
	 }

}

class string{
	
	public String reverseString(String input) {
		if(input.equals("")) {
			return "";
			}
		return reverseString(input.substring(1))+input.charAt(0);
		}
		
}
