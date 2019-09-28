package com.amazon.SimpleJDBCInsert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
		/*SimpleJdbcInsert jdbcInsert = container.getBean(SimpleJdbcInsert.class);
		jdbcInsert.withTableName("EMP_TBL");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("eno", 98);
		map.put("name", "Reena");
		map.put("salary", 10000d);
		jdbcInsert.execute(map);*/
		
		JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
		jdbcTemplate.execute("call myproc()");
		
		container.close();
	}
}
