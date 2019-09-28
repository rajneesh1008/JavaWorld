package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HoneywellTaxCall {
	
	@Autowired
	private ADPCommunicationProxy proxy;

	@GetMapping("/honeywell/caltax/{eno}/{name}/{gender}/{salary}")
	public HoneywellEmployee calTax(
			@PathVariable("eno") Integer eno,
			@PathVariable("name") String name,
			@PathVariable("gender") String gender,
			@PathVariable("salary") Double salary) {
		
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("eno", eno);
//		map.put("salary", salary);
//		
//		RestTemplate restTemplate = new RestTemplate();
//		String url = "http://localhost:7001/adp/tax/{eno}/{salary}";
//		ResponseEntity<HoneywellEmployee> entity = restTemplate.getForEntity(url, HoneywellEmployee.class, map);
//		HoneywellEmployee employee = entity.getBody();
		
		HoneywellEmployee employee = proxy.calTax(eno, salary);
		
		HoneywellEmployee honeywellEmployee = new HoneywellEmployee();
		honeywellEmployee.setEno(employee.getEno());
		honeywellEmployee.setName(name);
		honeywellEmployee.setSalary(employee.getSalary());
		honeywellEmployee.setGender(gender);
		honeywellEmployee.setNetSalary(employee.getNetSalary());
		honeywellEmployee.setTaxAmount(employee.getTaxAmount());
		honeywellEmployee.setPortNumber(employee.getPortNumber());
		
		return honeywellEmployee;
	}
}

















