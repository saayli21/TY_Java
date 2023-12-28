package movieTicket;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MovieTicket mt = null;
		System.out.println("Welcome to Movie Ticket");
		System.out.println("Enter the choice");
		System.out.println("First Class");
		System.out.println("Second Class");
		System.out.println("Balcony");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		mt=new FirstClass();
		break;
		case 2:
		mt=new SecondClass();
		break;
		case 3:
		mt=new Balcony();
		break;
		default:
		System.out.println("Wrong Choice");
		}
		if(mt instanceof SecondClass)
		{
			SecondClass sc1=(SecondClass)mt;
			System.out.println(sc1.price);
		}
		else if(mt instanceof FirstClass)
		{
			FirstClass fc1=(FirstClass)mt;
			System.out.println(fc1.price);
		}
		else
		{
			Balcony b=(Balcony)mt;
			System.out.println(b.price);
		}
	}
}
