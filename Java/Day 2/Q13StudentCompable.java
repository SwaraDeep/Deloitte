package JavaDay2;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

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
	public int compareTo(Student o) {
		if(this.age == o.age) {
			return 0;
		}else if(this.age < o.age) {
			return -1;
		}else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return "\n[Id: " + this.id + ", Name: " + this.name + ", Age: " + this.age + "]";
	}
	
}


public class Q13StudentCompable {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setId(121);
		s2.setId(213);
		s3.setId(321);
		
		s1.setName("Beta");
		s2.setName("Alpha");
		s3.setName("Gamma");
		
		s1.setAge(10);
		s2.setAge(65);
		s3.setAge(30);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println("Sorted based on age: \n" + al);
	}

}
