package number;

public class primeNumber {
	public static void main(String[] args) {
		int num=5;
		boolean flag=true;
		for(int i=2; i<=num-1;i++) {
			if(num%i==0) {
				flag=false;
				}
		}
		if(flag==true) {
			System.out.println("PN");
		}else {
			System.out.println("NPN");
		}
	}

}
