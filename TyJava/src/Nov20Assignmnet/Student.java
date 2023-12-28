package Nov20Assignmnet;
import java.util.*;


	public class Student implements Comparable
	{
		String name;
		int id;
		int std;
		double percentage;
		public Student(String name, int id, int std, double percentage) {
			super();
			this.name = name;
			this.id = id;
			this.std = std;
			this.percentage = percentage;
		}
		public Student() {
			// TODO Auto-generated constructor stub
		}
		public String toString()
		{
			return "Name:"+name+" "+"Student ID:"+id+" "+"Standard:"+std+" "+"Percentage:"+percentage;
		}
		
		public int compareTo(Object o)
		{
			Student s=(Student)o;
			if(this.percentage==s.percentage)
			{
				return 0;
			}
				
			else if(this.percentage>s.percentage)
			{
				return 1;
			}
			else 
			{
			return -1;	
			}
		}
		public static void read()
		{
			System.out.println("Student is reading");
		}
		
		public static void write()
		{
			System.out.println("Student is wrting");
		}
		
		public static void play()
		{
			System.out.println("Student is playing");
		}
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size");
			int size=sc.nextInt();
			LinkedList<Student> li=new LinkedList();
			for(int i=0; i<size; i++)
			{
				System.out.print("Enter Name:");
				sc.nextLine();
				String s=sc.nextLine();
				
				System.out.print("Enter ID:");
				int id=sc.nextInt();
				
				System.out.print("Enter Standard:");
				int std=sc.nextInt();
				
				System.out.print("Enter Percentage:");
				double percentage=sc.nextDouble();
				
				li.add(new Student(s,id,std,percentage));
			}
		
			System.out.println("Before sorting:"+ li);
			Collections.sort(li);
			System.out.println("After sorting:"+ li);
			
			Student s2=new Student();
			s2.read();
			s2.write();
			s2.play();
			
	}
}





