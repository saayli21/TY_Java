package String;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
	//	System.out.println(s1.charAt(s1.length())));      //STRING INDEX OUTOF BOUND EXCEPTION
		System.out.println(s1.charAt(s1.length()-1));

	}

}
