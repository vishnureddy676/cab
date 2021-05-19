package com.vishnu.db;


import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



public class Logindatabase implements Logindb {

	@Override
	public void Insert(Object[] vis) {
	 JdbcTemplate jdbcTemplate  = new JdbcTemplate(getDataSource());
		
		String sql= "INSERT INTO Cab VALUES(?,?,?,?)";
		
			
		
			
		int abc=jdbcTemplate.update(sql,vis);
		System.out.println(abc);
		
		

		}
		
		
		public DataSource getDataSource() {
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String username="system";
			String password="ammananna@7";
			String classname="oracle.jdbc.driver.OracleDriver";
			
			DriverManagerDataSource dataSource =new DriverManagerDataSource();
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setUrl(url);
			dataSource.setDriverClassName(classname);
			
			
			return dataSource;
		}


	}


