package JavaDay2;

import java.util.TreeMap;

class Car implements Comparable<Car>{
	
	public String carName;
	public String model;
	public String engineVersion;
	public String carType;
	
	public Car(String carName, String model, String engineVersion, String carType) {
		this.carName = carName;
		this.model = model;
		this.engineVersion = engineVersion;
		this.carType = carType;
	}
	
	@Override
	public int compareTo(Car o) {
		return this.carName.compareTo(o.carName);
	}
	
	@Override
	public String toString() {
		return "\n[Car Name : " + this.carName + " , Model: " + this.model + " , Engine Version: " + this.engineVersion + " , Car Type: " + this.carType + "]";
	}
}

public class Q111CarTreeMap {

	public static void main(String[] args) {
		Car c1 = new Car("Some car", "model1", "engine123", "type1");
		Car c2 = new Car("My car", "model2", "engine124", "type2");
		Car c3 = new Car("Your car", "model3", "engine1233", "type3");
		
		TreeMap<Car, String> tm = new TreeMap<Car, String>();
		
		tm.put(c1, "Tesla");
		tm.put(c2,  "Audi");
		tm.put(c3,  "Benz");
		
		System.out.println(tm.toString());

	}

}
