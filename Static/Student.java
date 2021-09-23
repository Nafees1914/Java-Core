package Static;

public class Student 
{
	String name;
	int rollNo;
	static int totalStudents;
	
	public Student(String name) 
	{
		this.name = name; 
		
		totalStudents ++;
		this.rollNo = totalStudents;
	}
	
	
	// non static fxn : non static variable access ? YES
	// non static fxn : static variable access ? Yes
	// non static fxn : non static fxn call ? yes
	// non static fxn : static fxn call ? YES
	public void introduceYouself() 
	{
		System.out.println(totalStudents);
		System.out.println(name + " has roll no " + rollNo);
	}
	
	// static fxn : non static variable access ? NO
	// static fxn : static variable access ? YES
	// static fxn : non static fxn call ? NO
	// static fxn : static fxn call ? YES
	
	public static void getNoStudents()
	{
		System.out.println("Total Students are : " + totalStudents);;
	}
}
