package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ADPTaxCalService {

	@Autowired
	private Environment environment;
	
	
	@GetMapping(path="/adp/tax/{eno}/{salary}")
	public EmployeeTaxData calTax(@PathVariable("eno") Integer eno,
			@PathVariable("salary") Double salary) {
		
		double taxAmount = (salary * 30)/100;
		double netSalary = salary - taxAmount;
		EmployeeTaxData employeeTaxData = new EmployeeTaxData();
		employeeTaxData.setEno(eno);
		employeeTaxData.setSalary(salary);
		employeeTaxData.setNetSalary(netSalary);
		employeeTaxData.setTaxAmount(taxAmount);
		employeeTaxData.setPortNumber(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return employeeTaxData;
	}
}





















