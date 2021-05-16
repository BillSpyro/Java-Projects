package Exercise2;

public class PartTimeGameTester extends GameTester
{
	
	protected int hours; //instance variable type int
	
	public PartTimeGameTester(int inputHours) {
		hours = inputHours;
		name = "Part Time";
		salary = 20;
	}
	
	public void setSalary(int newSalary)
    {         
       salary = newSalary;                         
           
    }
	
	public int getSalary()
    {
       return salary * hours;
    }
	
	public void setName(String newName)
    {         
       name = newName;                         
           
    }
	
	public String getName()
    {
       return name;
    }

	
}
