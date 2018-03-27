public class EmployeeInfo
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President", 85.00, 40.0);
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer", 50.00, 60.0);
		Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer", 45.00, 37.5);
		
		System.out.printf("%-15s%-10d%-15s%-15s$%-,13.2f\n", employee1.getName(), employee1.getID(), employee1.getDepartment(), employee1.getPosition(), employee1.grossPay());
		System.out.printf("%-15s%-10d%-15s%-15s$%-,13.2f\n", employee2.getName(), employee2.getID(), employee2.getDepartment(), employee2.getPosition(), employee2.grossPay());
		System.out.printf("%-15s%-10d%-15s%-15s$%-,13.2f\n", employee3.getName(), employee3.getID(), employee3.getDepartment(), employee3.getPosition(), employee3.grossPay());
	}
}
