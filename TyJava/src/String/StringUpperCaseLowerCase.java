package String;

public class StringUpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="AAccDDbb";
		char arr[]=s1.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='A' && arr[i]<='Z') {
				arr[i]=(char) (arr[i]+32);
			}else {
				arr[i]=(char) (arr[i]-32);
			}
		}
			String s2="";
			for(int i=0; i<arr.length; i++) {
				s2=s2+arr[i];
			}
				System.out.println(s2);

	}

}
