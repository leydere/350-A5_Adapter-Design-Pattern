package base;

public class A5_Demo {

	 public static void main(String args[]){  

		  ICarSpec targetInterface=new AdapterWrapper();  
		  System.out.println("Max speed is: " + targetInterface.getMaxSpeed());  
		  System.out.println(targetInterface.getfullCarname());
		  System.out.println("Fuel capacity is: " + targetInterface.getCarFuelCap());

	 }   
	 
}
