package in.pwskills.kalyan.config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.EnableScheduling;





//telling the IOC container that this is a configuration file denoting with annotation @Configuration
//this is the configuration details that the IOC container will execute, creates a bean, keep it in IOC cache and then give it to you
@Configuration
@ComponentScan(basePackages = "in.pwskills.kalyan")
@EnableScheduling // scheduling will be enabled for all these classes under base package
public class AppConfig {
	
	
//	static {
//		System.out.println("AppConfig.class file is loading...");
//	}
//	
//	public AppConfig() {
//		System.out.println("AppConfig object is created...");
//	}
	
	
	
	
}
