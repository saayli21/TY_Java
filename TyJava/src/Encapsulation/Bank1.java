package Encapsulation;

public class Bank1 {
	private double Balance;
	private int pin=1234;
	public Bank1(double Balance, int pin) {
		super();
		this.Balance=Balance;
	}
	//GETTER METHOD FOR BALANCE
	public String getbalance(int pin) 
	{
		if(this.pin==pin)
			return "Balance:"+this.Balance;
		else 
			return "Invalid pin" ;
	}
	public void deposit(int depositAmt)
	{
		if(depositAmt>0)
		{
			this.Balance+=depositAmt;
			System.out.println("Deposited Successfully");
		}
		else
		{
			System.out.println("Deposite amount should be greater than zero");
		}
	}
	
	public void withdrawl(int pin, int withdrawl)
	{
		if(this.pin==pin)
		{
			if(withdrawl<0 && withdrawl>0)
			{
				this.Balance-=withdrawl;
				System.out.println("Withdrawn");
			}
			else
			{
				System.out.println("Amount can not be withdrawn");
			}
		}
			else
			{
				System.out.println("Pin is Invalid");
			}
		}
	}

	
	

	




