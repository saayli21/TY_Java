package String;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mom";
		String rev="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("It is a String pallindrome");
		}else
		{
			System.out.println("Not a String pallindrome");
		}

	}

}
