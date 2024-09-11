package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	
	int age;
	String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.age > o.age)
		return 1;
		else
			return -1;
	}
	
	public static void main(String args[]) {
		
		
		List<Student> students=new ArrayList<Student>();
		students.add(new Student(22,"chethan"));
		students.add(new Student(24,"nikhitha"));
		students.add(new Student(40,"prema"));
		students.add(new Student(45,"ravikumar"));
		
		
		Collections.sort(students);
		
		 for(Student s:students)
		System.out.println(s);
	}

}
