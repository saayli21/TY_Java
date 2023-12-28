package ObjectClass;

public class ToStringStudent {
		String sname;
		int sid;
		int std;
		ToStringStudent(String sname, int sid, int std){
			this.sname=sname;
			this.sid=sid;
			this.std=std;
		}
		public String toString() {
			return "Student Name:"+ this.sname+" "+ "Sid:" + this.sid+" "  + "Standard:"+ this.std;
		}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringStudent s1=new ToStringStudent("Sayali", 6, 1);
		System.out.println(s1);
		ToStringStudent s2=new ToStringStudent("Saloni", 7, 1);
		System.out.println(s2);
		ToStringStudent s3=new ToStringStudent("Sayali", 8, 1);
		System.out.println(s3);
	}

}
