package in.pwskills.kalyan.beans;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	// object for ReportGenerator is created now I am telling container, scan for a method annotated with scheduled and also tell when it should be done
	/*
	 * initial delay means as soon as container starts wait for 2 sec // 
	 * fixed delay means after how much time again  the result should be generated, for this case its 3s /// fixed delay means period of time
	 */
	
	//@Scheduled(initialDelay = 2000, fixedDelay = 1000) // this inputs are in ms
	@Scheduled(initialDelay = 2000, fixedRate  = 3000) // this inputs are in ms
	public void generateSalesReport() {
		try {
			Thread.sleep(5000); // 5ms
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("sales report on :: " + new Date());
	}
}
