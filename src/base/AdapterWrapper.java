package base;
public class AdapterWrapper extends RacingCar implements ICarSpec {

	@Override
	public int getMaxSpeed() {
		
		return getTopSpeedRacingMode();
	}

	@Override
	public String getfullCarname() {

		String make = getMake();
		String model = getModel();
		String year = getYear();
		String concatenatedString = "This vehicle is a " + year + " " + make + " " + model + ".";
		return concatenatedString;
	}

	@Override
	public double getCarFuelCap() {
		return getCarFuelCapacity();
	}

}
