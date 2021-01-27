package JavaDay2;

import java.util.HashMap;

class Employee {
	public String name;
	public int sal;
	public String company;
	
	public Employee(String name, int sal, String company) {
		this.name = name;
		this.sal = sal;
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}


public class Q1HashMapEmployee {

	public static void main(String[] args) {
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		Employee e1 = new Employee("Beta", 12300, "Audi");
		Employee e2 = new Employee("Alpha", 653400, "Konigsegg");
		Employee e3 = new Employee("Gamma", 25300, "Jaguar");
		Employee e4 = new Employee("Gamma", 374500, "Buggatti");
		
		hm.put(e1, "Dierctor");
		hm.put(e3, "Manager");
		hm.put(e2, "HR");
		hm.put(e4, "CBO");
		
		if(hm.get(e1) == hm.get(e2)) {
			System.out.println("Both are same!");
		}else {
			System.out.println("Both are different!");
		}
		
		if(e3.equals(e4)) {
			System.out.println("Both person names are equal!");
		}else {
			System.out.println("Both person names are not equal!");
		}
	}

}
