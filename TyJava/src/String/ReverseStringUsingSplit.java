package String;

public class ReverseStringUsingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jo bhi kasame khayi thi wade kiye the sare tune hi laya tha jivan me mere sawera kya tujhe yaad hai";
		String arr[]=s1.split(" ");
		String rev=" ";
		for(int i=arr.length-1; i>=0; i--) {
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);

	}

}
