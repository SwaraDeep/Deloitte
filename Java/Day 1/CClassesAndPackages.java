
public class CClassesAndPackages {

	public static void main(String[] args) {
		Car c1 = new Car("BMW");
		Car c2 = new Car("AUDI", "Sports");
		Car c3 = new Car(1.2, "Muscle");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}

class Car{
	private String company = "None";
	private String model = "None";
	private double engineVersion = 0.0f;
	private String carType = "None";
	
	public Car(){};
	
	public Car(String company) {
		this.company = company;
	}
	
	public Car(String company, String carType) {
		this.company = this.carType;
	}
	
	public Car(double engineVersion, String carType) {
		this.engineVersion = engineVersion;
		this.carType = carType;
	}
	
	public String toString() {
		return "Company: " + company + "\t Model: " + model + "\t Engine Version: " + engineVersion + " Type: " + carType;
	}
	
}