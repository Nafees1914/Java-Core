package Static;

public class Client {

	public static void main(String[] args) 
	{
		//for default constructor
		
//		Student s = new Student();
//		System.out.println(s.name);
//		System.out.println(s.rollNo );
//		
//		s.name = "A";
//		s.rollNo = 10;
//		
//		Student s1 = new Student();
//		s1.name = "B";
//		s1.rollNo = 20;
//		
//		System.out.println(s.name);
//		System.out.println(s1.name);
//		
//		//to access static MEMBER
//		System.out.println(Student.totalStudents);
		
 		
		// for parameterized constructor
		Student s = new Student("A");
		s.introduceYouself();
		
		Student s1 = new Student("B");
		s1.introduceYouself();
		
		//to access static MEMBER
		System.out.println(Student.totalStudents);
		
		Student.getNoStudents();
		 
	}

}
