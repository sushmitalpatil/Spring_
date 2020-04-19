package com.sushmita.conf;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
@EnableJpaRepositories(basePackages = {"org.springframework.data.jpa.repository.JpaRepository"})
@PropertySource("classpath:database.properties")
public class PersistenceJPAConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	 
	    dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
	    dataSource.setUsername(env.getProperty("jdbc.user"));
	    dataSource.setPassword(env.getProperty("jdbc.pass"));
	    dataSource.setUrl(env.getProperty("jdbc.url"));
	    Properties properties = new Properties();
	    properties.setProperty("spring.jpa.hibernate.ddl-auto", "create");
	    dataSource.setConnectionProperties(properties);
	     
	    return dataSource;
	}
}
