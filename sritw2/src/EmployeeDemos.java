class Employee 
{
	int empNum;
	String empName;
	double empSalary;
	Employee(){ }
	Employee(int empNum,String empName) {
		this.empNum=empNum;
		this.empName=empName;
	}
	Employee(int empNum,String empName,double empSalary)
	{
		this(empNum,empName);
		this.empSalary=empSalary;
	}
	void dispEmpDetails()
	{
		System.out.println("Employee No: "+empNum+" Employee Name: "+empName+"  Salary: "+empSalary);
	}
}
public class EmployeeDemos {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.dispEmpDetails();
		Employee e2= new Employee(101, "Bob",50000);
		e2.disEmpDetails();
		Employee e2= new Employee(102,"shyam");
		e3.dispEmpDetails();
	}
	
	}
