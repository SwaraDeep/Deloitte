package JavaDay2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student>{

	private int id;
	private String name;
	private int age;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "\n[Id: " + this.id + ", Name: " + this.name + ", Age: " + this.age + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
}

class IdCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId() - o2.getId();
	}
}

class NameCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class Q14StudentComparator {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setId(121);
		s2.setId(231);
		s3.setId(231);
		
		s1.setName("Beta");
		s2.setName("Alpha");
		s3.setName("AAamma");
		
		s1.setAge(10);
		s2.setAge(65);
		s3.setAge(30);
		
		List<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al, new IdCompare().thenComparing(new NameCompare()));
		System.out.println("Sorted based on Id and then Name: \n" + al);
	}

}
