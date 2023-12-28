package String;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello Hii Hello How are you Hii";
		String arr[]=s1.split(" ");
		String s2=" ";
		for(int i=0; i<arr.length; i++) {
			if(s2.contains(arr[i])==false)
			{
			s2=s2+arr[i]+" ";
		    }
		}
		System.out.println(s2);
     }
}

