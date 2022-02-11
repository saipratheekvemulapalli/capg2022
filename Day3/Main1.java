package proj2;
class Employee {
	String empName;
	Integer empAge;
	protected Employee(String empName, Integer empAge) {
		this.empName = empName;
		this.empAge = empAge;
	}
	public void dispEmployeeDetail() {
		System.out.println("Name "+ empName + ",Age" + empAge);
	}
}
class Manager1 extends Employee{
	String departName;
	protected Manager1(String empName, Integer empAge, String departName) {
		super(empName, empAge);
		this.departName = departName;
	}
	public void dispMangerDetail() {
		System.out.println("Department Name"+ departName);
	}	
}
public class Main1 {

	public static void main(String[] args) {
		Employee manager = new Manager1("Johnson",28,"Sales Department");
		manager.dispEmployeeDetail();
		

	}

}
