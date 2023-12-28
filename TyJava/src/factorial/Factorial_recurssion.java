package factorial;

public class Factorial_recurssion {
	public static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		 return num*factorial(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));

	}

}
