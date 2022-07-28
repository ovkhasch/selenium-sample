package week1.day1;


public class Student {
	
	String name = "Salesian";
	int rollNo =600837;
	
	public static void main(String[] args) {
		
		Student object=new Student();
		String outputCollegeName = object.college();
		System.out.println("Name of the College: " + outputCollegeName);
		String outputName = object.name;
		System.out.println("My name is: " + outputName);
		int outputrollNo = object.rollNo;
		System.out.println("My roll no is: " +outputrollNo);
	}
	

	
	public String college() {
		
		String collegeName = "Hindustan College Of Engineering";
		return collegeName;
	}
	

}
