public class Employee 
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	private double payRate;
	private double hoursPerWeek;
	
	public Employee(String n, int id, String dep, String pos, double pay, double hours)
	{
		setName(n);
		setID(id);
		setDepartment(dep);
		setPosition(pos);
		setPayRate(pay);
		setHoursPerWeek(hours);
	}
	public Employee(String n, int id)
	{
		setName(n);
		setID(id);
		setDepartment("");
		setPosition("");
		setPayRate(0.0);
		setHoursPerWeek(0.0);
	}
	public Employee()
	{
		setName("");
		setID(0);
		setDepartment("");
		setPosition("");
		setPayRate(0.0);
		setHoursPerWeek(0.0);
	}

	public void setName(String n)
	{
		name = n;
	}
	public void setID(int id)
	{
		idNumber = id;
	}
	public void setDepartment(String dep)
	{
		department = dep;
	}
	public void setPosition(String pos)
	{
		position = pos;
	}
	public void setPayRate(double pay)
	{
		payRate = pay;
	}
	public void setHoursPerWeek(double hours)
	{
		hoursPerWeek = hours;
	}
	
	public String getName()
	{ 
		return name; 
	}
	public int getID()
	{ 
		return idNumber;
	}
	public String getDepartment()
	{ 
		return department; 
	}
	public String getPosition()
	{ 
		return position; 
	}
	public double getPayRate()
	{
		return payRate;
	}
	public double getHoursPerWeek()
	{
		return hoursPerWeek;
	}
	
	public double grossPay()
	{
		return (payRate * hoursPerWeek);
	}
}
