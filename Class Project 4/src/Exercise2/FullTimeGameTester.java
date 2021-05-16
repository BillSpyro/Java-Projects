package Exercise2;

public class FullTimeGameTester extends GameTester
{
	
	public FullTimeGameTester() {
		name = "Full Time";
		salary = 3000;
	}
	
	public void setSalary(int newSalary)
    {         
       salary = newSalary;                         
           
    }
	
	public int getSalary()
    {
       return salary;
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
