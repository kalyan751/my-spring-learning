package in.pwskills.kalyan;

import java.io.IOException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import in.pwskills.kalyan.config.AppConfig;

public class TestApp {

	public static void main(String[] args) throws IOException {
		//creating the object for AnnotationConfigApplicationContext(AppConfig.class)
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // where our configuration file is present ? Ans : AppConfig.class
	
		
		System.out.println("Container startd on : " + new Date());

		
		
		/* we should notstop the container because if we stop the container then object of  ReportGenerator 
		 * wont be created. if object is only not created then the method annotated with @schedule  wont work.
		 */
		//closing the container
		//((AbstractApplicationContext)context).close(); 
		

	}

}
