package com.way2learnonline;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import com.way2learnonline.service.BankService;

//@PropertySource("classpath:db.properties")	


//@Configuration
//@ComponentScan
//@EnableAutoConfiguration

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 	SpringApplication.run(MainApplication.class);
		BankService service =  context.getBean(BankService.class);
		
		try {
			service.transfer(1L, 2L, 200);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	@Value("classpath:dbscripts.sql")private Resource dbscript;
	
//	@Autowired
//	private Environment env;
	
//	@Bean
//	@ConfigurationProperties(prefix = "db")
//	public DataSource dataSource(){		
//		BasicDataSource dataSource= new BasicDataSource();
//		
//		return dataSource;		
//	}
	
//	@Bean
//	public DataSource dataSource(@Value("${db.driverclassname}") String driverClassName, 
//								@Value("${db.user}") String username, 
//								@Value("${db.password}") String password, 
//								@Value("${db.url}") String url){		
//		BasicDataSource dataSource= new BasicDataSource();
//		dataSource.setDriverClassName(driverClassName);
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
//		return dataSource;		
//	}
	
//	@Bean
//	public DataSourceInitializer dataSourceInitializer(DataSource dataSource){
//		DataSourceInitializer initializer= new DataSourceInitializer();
//		initializer.setDataSource(dataSource);
//		initializer.setDatabasePopulator(databasePopulator());
//		return initializer;
//	}
//	
//	private DatabasePopulator databasePopulator() {
//	     ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//	    populator.addScript(dbscript);		   
//	    return populator;
//	}

	
	//dont' have any configuration
}
