package week2.day1assignment;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println("empName:"+empName);
		System.out.println("empId:"+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("empAddress:"+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("empSalary:"+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("mobNum:"+mobNum);
		}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	EmployeeDetails Employee=new EmployeeDetails();
    	Employee.printEmployeeName("Vignesh", 12);
    	Employee.getEmployeeAddress("Tirunelveli");
    	Employee.printEmployeeSalary(30000.21);
    	Employee.printEmployeeMobileNumber(9003893172L);
    }
}
