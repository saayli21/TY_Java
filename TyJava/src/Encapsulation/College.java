package Encapsulation;

public class College {
	private String sname;
	private int regiNumber;
	private int sem;
	private int number_Of_Backlog;
	private String branch;
	
	    public College(String sname, int regiNumber, int sem, int number_Of_Backlog, String branch) {
		super();
		this.sname = sname;
		this.regiNumber = regiNumber;
		this.sem = sem;
		this.number_Of_Backlog = number_Of_Backlog;
		this.branch = branch;
	}
	    public String getsname()
	    {
	    	return this.sname;
	    }
	    public void setsname(String sname)
	    {
	    	this.sname=sname;
	    }
	    public int getregiNumber()
	    {
	    	return this.regiNumber;
	    }
	    public int getsem()
	    {
	    	return this.sem;
	    }
	    public String getbranch()
	    {
	    	return this.branch;
	    }
	    public String toString() {
	    	return "Student Name:"+ this.sname+" "+ "Registration Number:" + this.regiNumber+" "  + "Semester:"+ this.sem+" "+ "Number of Backlog:"+ this.number_Of_Backlog+" "+"Branch:"+this.branch;
	    }
}
