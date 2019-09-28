package info.inetsolv;

import java.util.List;

public class DisplayData {

	public static void main(String[] args) {
		GetEmployeeData employeeData = new GetEmployeeData();
		List<Employee> list = employeeData.getData();
		for (Employee employee : list) {
			System.out.println(employee.getEno()+ ""+employee.getName()+""+employee.getSalary());
		}

	}

	
	
}
