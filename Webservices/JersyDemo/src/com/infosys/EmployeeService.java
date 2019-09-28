package com.infosys;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path(value="/employee")
public class EmployeeService {

//	@GET
//	@Produces(value= {"application/xml"})
//	public Employee findEmployee() {
//		return new Employee(1, "Anil",10000d);
//	@POST
//	public void saveEmployee()
//	{
//		System.out.println("saving emp data");
//	
//@POST
//public Response saveEmployee() {
//	System.out.println("saving emp data");
//	return Response.ok().build();
//}
	@GET
	@Produces(value= {"application/xml","application/json"})
	@Path(value="/{eno}")
	public Response findById(@PathParam("eno")Integer eno) {
		Employee employee = new Employee(eno, "Anil",10000d);
		return Response.ok().build();
	
		
	}
}