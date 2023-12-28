package armstrong;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=153;
     int count=0;
     int temp=num;
     while(temp!=0) 
     {
    	 count++;
    	 temp=temp/10;
     }
   int arm=0;
   int temp1=num;
   while(temp1!=0) 
   {
	   int rem=temp1%10;
	   int pow=1;
	   for(int i=1; i<=count; i++)
	   {
		   pow=rem*pow;
	   }
	   arm=arm+pow;
	   temp1=temp1/10;
   }
   if(arm==num)
   {
	   System.out.println("Armstrong Number");
   } 
   else 
   {
	   System.out.println("Not a armstrong number");
   }
  }
}
