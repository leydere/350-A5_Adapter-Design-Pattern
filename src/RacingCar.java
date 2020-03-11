
public class RacingCar {
	
	int topRacingSpeed;
	int topNormalSpeed;
	String make;
	String model;
	String year;
	double fuelCapacity;
	
	
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
