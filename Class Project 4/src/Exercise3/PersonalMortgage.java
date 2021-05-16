package Exercise3;

class PersonalMortgage extends Mortgage  {
	PersonalMortgage(int MortNumber, String MortName, String CustomerName, int MortAmount, int rate, int term) {
		super(MortNumber, MortName, CustomerName, MortAmount, rate, term);
		
	}
	
	PersonalMortgage(){
	}
	
	@Override
	public void getMortgageInfo() {
		System.out.printf("This is your Mortgage-Number : %s%n%n", MortNumber);
		System.out.printf("This is your Interest-rate : %s%n%n", rate);
		System.out.printf("This is your Name : %s%n%n", CustomerName);
		System.out.printf("This is your Mortgage-Amount : %s%n%n", MortAmount);
		System.out.printf("This is your Term : %s%n%n", term);
		System.out.printf("This is your Mortgage-Name : %s%n%n", MortName);
	}
	
	@Override
	void SetInfo(int x, String y, String d, int a, double c, int g) {
		MortNumber = x;
		MortName = y;
		CustomerName = d;
		MortAmount = a;
		rate = c + 0.02;
		term = g;
	}
}
