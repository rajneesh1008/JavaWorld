package com.worldbankgroup.NamedParameterJdbcTemplate;

import java.util.HashMap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.worldbankgroup.utils.MOCUtil;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container=  new AnnotationConfigApplicationContext(MOCUtil.class);
    	NamedParameterJdbcTemplate jdbcTemplate = container.getBean(NamedParameterJdbcTemplate.class);
    	String sql="insert into EMP_TBL values(:eno,:name,:salary)";
    	HashMap<String,Object> map = new HashMap<String,Object>();
    	map.put("eno",64);
    	map.put("name","Rashmi");
    	map.put("salary",500000);
    	jdbcTemplate.update(sql,map);
    	container.close();
    }
}
