package edu.bu.met622.vehicle;

public class Execution {
	
	/**
	 * Instantiating a class
	 * @param args
	 */
	public static void main (String[] args) {
	
		Car mycar = new  Car("Corolla", 200000);
		System.out.println(mycar.findPrice());
	    
	    ElectricCar newCar = new ElectricCar("Tesla", 9899, 2);
	    System.out.println(newCar.findPrice("Tesla"));
	    
	   // ElectricCar wrongCar = new Car("Corolla", 200000);
	}
}

 