package prob04;

public class Depart extends Employee {
	private String department;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment (String department) {
		this.department = department;
	
	
	public Depart(String name, int salary, String depart) {
		setName(name);
		setSalary(salary);
		setDepartment(department);
	}
	public void getInformation() {
		System.out.println("이름 : " + getName() + " 연봉 : " + getSalary() +
				" 부서 : " + department);
	}
	
}
