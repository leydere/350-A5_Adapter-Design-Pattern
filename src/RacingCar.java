
public class RacingCar {
	
	int topRacingSpeed = 100;
	int topNormalSpeed = 60;
	String make = "Toyota";
	String model = "Corolla";
	String year = "1998";
	double fuelCapacity = 30.3;
	
	
	public int getTopSpeedRacingMode() {
		
		return topRacingSpeed;
	}

	public int getTopSpeedNormalMode() {
		
		return topNormalSpeed;
	}

	public String getMake() {
		
		return make;
	}

	public String getModel() {
		
		return model;
	}

	public String getYear() {
		
		return year;
	}

	//set this to return double; assignment did not declare it as return type or void so made assumption
	public double getCarFuelCapacity() {
		
		return fuelCapacity;
	}
}
