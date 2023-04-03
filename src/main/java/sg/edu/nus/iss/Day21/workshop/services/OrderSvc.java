package sg.edu.nus.iss.Day21.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.Day21.workshop.models.Order;
import sg.edu.nus.iss.Day21.workshop.repositories.OrderRepo;

@Service
public class OrderSvc {
    
    @Autowired
    private OrderRepo orderRepo;

    public List<Order> getOrdersByCustomerId(int id) {
        return orderRepo.getCustomerOrdersById(id);
    }
}
