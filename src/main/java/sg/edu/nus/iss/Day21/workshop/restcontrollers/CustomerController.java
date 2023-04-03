package sg.edu.nus.iss.Day21.workshop.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.Day21.workshop.models.Customer;
import sg.edu.nus.iss.Day21.workshop.models.Order;
import sg.edu.nus.iss.Day21.workshop.services.CustomerSvc;
import sg.edu.nus.iss.Day21.workshop.services.OrderSvc;

@RestController
@RequestMapping(path="/api/customers", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    @Autowired
    private CustomerSvc customerSvc;
    @Autowired
    private OrderSvc orderSvc;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerSvc.getAllCustomers();
    }

    @GetMapping("/limit")
    public List<Customer> getAllCustomersWithLimitOffset(@RequestParam int limit, @RequestParam int offset) {
        return customerSvc.getAllCustomersWithLimitOffset(limit, offset);
    }

    @GetMapping("{customer_id}")
    public Customer getCustomerById(@PathVariable("customer_id") int id) {
        return customerSvc.getCustomerById(id);
    }

    @GetMapping("{customer_id}/orders")
    public List<Order> getOrdersByCustomerId(@PathVariable("customer_id") int id) {
        return orderSvc.getOrdersByCustomerId(id);
    }
}
