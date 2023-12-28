package Encapsulation;

public class Enduser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank("Shiv",40000,"ABC123","Banashankari",123456);
		System.out.println(b1.getcname());
		b1.setcname("Raam");
		System.out.println(b1.getcname());
		System.out.println(b1.getbalance());
		System.out.println(b1.getifsc());

 }
}
