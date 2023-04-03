package sg.edu.nus.iss.Day21.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.Day21.workshop.models.Customer;
import sg.edu.nus.iss.Day21.workshop.repositories.CustomerRepo;

@Service
public class CustomerSvc {
    
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.getAllCustomers();
    }

    public List<Customer> getAllCustomersWithLimitOffset(int limit, int offset) {
        return customerRepo.getAllCustomersWithLimitOffset(limit, offset);
    }

    public Customer getCustomerById(int id) {
        return customerRepo.getCustomerById(id);
    }
}
