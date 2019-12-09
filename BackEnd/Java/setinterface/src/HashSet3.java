import java.util.HashSet;

public class HashSet3 {
public static void main(String[] args) {
	HashSet<Student> h1=new HashSet<Student>();
	h1.add(new Student(22,"Divya"));
	h1.add(new  Student(23,"Anu"));
	h1.add(new Student(24,"Ramesh"));
	h1.add(new Student(22,"Divya"));
	for(Student s1:h1) {
		System.out.println(s1.StudAge+" and name is "+s1.StudName);
	}
	
}
}
