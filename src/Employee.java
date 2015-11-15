
public class Employee
{
	
	String employeeId, lastName, firstName;
	Double annualSalary;
	
	Employee(String employeeId , String lastName, String firstName , Double annualSalary)
	{
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.annualSalary = annualSalary;
	}
	
	public void setEmpId(String I)
	{
		employeeId = I;
	}
	
	public String getEmpId(String id)
	{
		return employeeId;
	}
	
	public void setLastName(String lname)
	{
		lastName = lname;
	}
	
	public String getLastName(String ln)
	{
		return lastName;
	}
	
	public void setFirstName(String fname)
	{
		firstName = fname;
	}
	
	public String getFirstName(String fn)
	{
		return firstName;
	}
	
	public void setAnnualSalary(Double as)
	{
		annualSalary = as;
	}
	
	public Double getAnnualSalary(Double s)
	{
		return annualSalary;
	}
	
	public String toString()
	{
		return "\nID: " + employeeId + "\n" + "Name: " + firstName + " " + lastName + "\n" + "Salary: " + annualSalary + "\n";
	}

}
