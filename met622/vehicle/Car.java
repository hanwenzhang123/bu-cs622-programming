package edu.bu.met622.vehicle;

public class Car {

	private String model;
	private int milesDriven;

	//Constructor of the class
		public Car (String model, int miles) {
			this.model = model;
	        this.milesDriven = miles;
		}
	
	
	//This method is also existed in ElectricCar class as well
	public int findPrice(){
       if (milesDriven < 50000)
          return 20000;
       else
          return 10000;
    }
	
	public boolean isOwneraRichkid() {
		String expensiveBrand = new String();
		expensiveBrand = "Bugatti" ;
		if (model.equalsIgnoreCase(expensiveBrand))
			return true;
			else return false;			
	}
}
