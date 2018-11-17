
public class Manager extends Employee {
	
	private double incentive=5000;
	
	public Manager(int EmployeeId, String EmployeeName) {
		super(EmployeeId,EmployeeName);
	}
	
	public double SalaryIs(double Salary) {
		Salary=Salary+incentive;
		return Salary;
	}
	

}
