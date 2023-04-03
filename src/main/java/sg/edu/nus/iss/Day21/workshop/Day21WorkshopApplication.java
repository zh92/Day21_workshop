package sg.edu.nus.iss.Day21.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sg.edu.nus.iss.Day21.workshop.services.CustomerSvc;
import sg.edu.nus.iss.Day21.workshop.services.OrderSvc;

@SpringBootApplication
public class Day21WorkshopApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerSvc customerSvc;
	@Autowired
	private OrderSvc orderSvc;
	public static void main(String[] args) {
		SpringApplication.run(Day21WorkshopApplication.class, args);
	}

	@Override
	public void run(String...args) {
		//System.out.println(customerSvc.getAllCustomersWithLimitOffset(3, 1));
		System.out.println(orderSvc.getOrdersByCustomerId(1));
	}
}
