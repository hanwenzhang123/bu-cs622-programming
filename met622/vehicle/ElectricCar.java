package edu.bu.met622.vehicle;

public class ElectricCar extends Car {

	private int energyEfficiency;

	public ElectricCar(String model, int miles, int eff) {
		super(model, miles);
		energyEfficiency = eff;
	}
	
	// Similar to Car class, but here it has been overridden
	public int findPrice() {
        int temp = super.findPrice();
        if (energyEfficiency < 3)
            return temp + 20000;
         else
            return temp + 30000; 
	}
	
	public int findPrice(String model) {
//		return 999999;
		if (model.equalsIgnoreCase("Tesla"))
			return 75000;
		else return findPrice();
	}
	
}
