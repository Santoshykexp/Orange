package constructor;

public class encapsulation {
	
	private int SSN;
	private String EmpName;
	private int Salary;
	

public static void main(String[] args) {

	encapsulation ob=new encapsulation();
	ob.setEmpName("Santosh");
	ob.setSalary(1000);
	ob.setSSN(1);
	System.out.println("SSN is :" +ob.getSSN());
	System.out.println("Employee Name is :"+ob.getEmpName());
	System.out.println("Employee Salary is:"+ob.getSalary());
}
	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
		
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	

}
