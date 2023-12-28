package Encapsulation;

public class Bank {
	private String cname;
	private double balance;
	private String ifsc;
	private String branch;
	private long accNumber;
	public Bank(String cname, double balance, String ifsc, String branch, long accNumber) {
		super();
		this.cname = cname;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
		this.accNumber = accNumber;
	}
	//GETTER FOR CUSTOMER NAME
	    public String getcname() {
		return this.cname;
	    }
   //SETTER FOR CUSTOMER NAME
		public void setcname(String cname)
		{
			this.cname=cname;
		}
	//GETTER METHOD FOR BALANCE
		public double getbalance() 
		{
			return this.balance;
		}
   //GETTER FOR IFSC
		public String getifsc()
		{
			return this.ifsc;
		}
	//GETTER FOR FOR BRANCH
		public String getbranch()
		{
			return this.branch;
		}
	//GETTER FOR ACCOUNT NUMBER
		public long getaccNumber()
		{
			return this.accNumber;
		}
		
	    }
			



