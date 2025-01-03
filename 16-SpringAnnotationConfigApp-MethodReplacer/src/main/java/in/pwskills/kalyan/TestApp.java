package in.pwskills.kalyan;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.kalyan.beans.Bank;
import in.pwskills.kalyan.config.AppConfig;

public class TestApp {

	public static void main(String[] args) throws IOException {
		//creating the object for AnnotationConfigApplicationContext(AppConfig.class)
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // where our configuration file is present ? Ans : AppConfig.class
		Bank bank = context.getBean(Bank.class);
		
		System.out.println(bank.calculateCompoundInterest(100000, 2, 12));

		
		
		
		//closing the container
		((AbstractApplicationContext)context).close();
		

	}

}
