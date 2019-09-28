package com.amazon.JDBCBatchUpdate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.amazon.DTO.Employee;
import com.amazon.Model.EmployeeService;
import com.amazon.data.DummyEmployeeData;
import com.amazon.util.MOCUtil;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(MOCUtil.class);
        EmployeeService service = context.getBean(EmployeeService.class);
		List<Employee> data = DummyEmployeeData.getEmployeeData();
		service.saveBulkData(data);
        ((AbstractApplicationContext)context).close();
    }
}
