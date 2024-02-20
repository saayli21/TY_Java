package practice;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello hello bye hi";
		String s2=" ";
		String arr[]=s1.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(s2.contains(arr[i])==false) {
				s2=s2+arr[i]+" ";
			}
		}
		System.out.println(s2);

	}

}
