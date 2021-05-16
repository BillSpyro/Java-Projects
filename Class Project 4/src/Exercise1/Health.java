package Exercise1;

public class Health extends Insurance {

	@Override
	public void setInsuranceCost(String typeOfInsuranceInput, double monthlyCostInput) {
		monthlyCost = monthlyCostInput;
		typeOfInsurance = typeOfInsuranceInput;
	}

	@Override
	public void DisplayInfo() {
		System.out.printf("Your Insurance is %s and your monthly fee is %s%n%n ", typeOfInsurance, monthlyCost);
	}

}
