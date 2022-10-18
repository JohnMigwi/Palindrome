package recursions;

public class Palindrome {

	public static void main(String[] args) {
		pal obj=new pal();
		boolean one=obj.palindrome("hello");
		boolean two=obj.palindrome("racecar");
		boolean three=obj.palindrome("Racecar");
		boolean four=obj.palindrome("KAYAK");
		System.out.print(one+"\n"+two+"\n "+three+"\n"+four);

	}
	
}

class pal{
	public boolean palindrome(String input) {
		//base case
		if(input.length()==0 || input.length()==1 ) {
			return true;
		}
		
		if(input.charAt(0) == input.charAt(input.length()-1)) {
			return palindrome(input.substring(1, input.length()-1));
		}
		return false;
	}
}
