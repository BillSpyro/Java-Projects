package Exercise1;

import Exercise2.GameTester;

public abstract class Insurance {

	protected String typeOfInsurance; //instance variable type string
	
	protected double monthlyCost; //instance variable type double
	
	public String getTypeOfInsurance()
    {
       return typeOfInsurance;
    }
	
	public double getMonthlyCost()
    {
       return monthlyCost;
    }

public abstract void setInsuranceCost(String typeOfInsurance, double monthlyCost);

public abstract void DisplayInfo();

}