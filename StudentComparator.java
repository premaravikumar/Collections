package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator {
 
	int age;
	String name;
	Long phone;
	
	public StudentComparator(int age, String name, Long phone) {
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
	}
	

	@Override
	public String toString() {
		return "StudentComparator [age=" + age + ", name=" + name + ", phone=" + phone + "]";
	}


	public static void main(String args[]) {
		
		Comparator<StudentComparator> com=new Comparator<StudentComparator>() {
			
			@Override
			public int compare(StudentComparator o1, StudentComparator o2) {
			 if (o1.age > o2.age)
				return 1;
				else
				return -1;
			}
		};
		
		 List<StudentComparator> comparators=new ArrayList<StudentComparator>();
		 comparators.add(new StudentComparator(22,"chethan",7337622017L));
		 comparators.add(new StudentComparator(65,"Boraiah",7259422285L));
		 comparators.add(new StudentComparator(60,"Lakshmamma",7337622456L));
		 comparators.add(new StudentComparator(40,"Prema",8296003782L));
		 comparators.add(new StudentComparator(24,"Nikhitha",7348912281L));
		 comparators.add(new StudentComparator(48,"Raviikumar",9741462364L));
   
		 Collections.sort(comparators,com);
	  
	   for(StudentComparator s:comparators) {
		System.out.println(s);
	}
 }

}
