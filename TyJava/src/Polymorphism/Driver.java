package Polymorphism;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     CreditCard c1=new CreditCard();
	     Swipe s1=new Swipe();
	     s1.SwappingMachine(c1); //UPCASTING
	     DebitCard d1=new DebitCard();
	     s1.SwappingMachine(d1);  //UPCASTING
	     Card c2=new Card();
	     s1.SwappingMachine(c2);
		}
    }


