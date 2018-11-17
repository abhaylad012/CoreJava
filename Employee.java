
public class Employee {
	
	private int EmployeeId;
	private String EmployeeName;
	//private double Salary;
	
	
	/*public Employee()//initialize instance variable--automatically gte called when object is created
	{
		EmployeeId=0;
		EmployeeName="Unknown";
	}*/
	
	public  Employee(int EmployeeId, String EmployeeName) {
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmployeeName;
		
	}
	

		public double SalaryIs(double salary) {
		return salary;
		/*this.setSalary(salary);
		System.out.println("Employee has salary Rs: "+this.getSalary()+"  "+ EmployeeId+"  "+EmployeeName);
		//return salary;
		//return salary;
		*/
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(1,"Abhay");
		Manager emp1 = new Manager(2,"Abhay2");

		emp.SalaryIs(1000);
		
		
		
		
	}
}


