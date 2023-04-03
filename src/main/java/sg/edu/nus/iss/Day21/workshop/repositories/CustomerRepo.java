package sg.edu.nus.iss.Day21.workshop.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.Day21.workshop.models.Customer;

@Repository
public class CustomerRepo {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_ALLCUSTOMERSDETAILS = "select id, company, first_name, last_name, address from customers";
    private static final String GET_OFFSETLIMIT_CUSTOMERSDETAILS 
       = "select * from customers limit ? offset ?";
    private static final String GET_CUSTOMERBYID = "select * from customers where id = ?";

    public List<Customer> getAllCustomers() {
        final List<Customer> customerList = new LinkedList<Customer>();
        final SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ALLCUSTOMERSDETAILS);

        while (rs.next()) {
            Customer cust = new Customer();
            cust.setId(rs.getInt("id"));
            cust.setCompany(rs.getString("company"));
            cust.setFirstName(rs.getString("first_name"));
            cust.setLastName(rs.getString("last_name"));
            cust.setAddress(rs.getString("address"));
            customerList.add(cust);
        }
        return Collections.unmodifiableList(customerList);
    }

    public List<Customer> getAllCustomersWithLimitOffset(int limit, int offset) {
        final List<Customer> custList = new ArrayList<Customer>();
        final SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_OFFSETLIMIT_CUSTOMERSDETAILS, limit, offset);

        while (rs.next()) {
            Customer cust = new Customer();
            cust.setId(rs.getInt("id"));
            cust.setCompany(rs.getString("company"));
            cust.setFirstName(rs.getString("first_name"));
            cust.setLastName(rs.getString("last_name"));
            cust.setAddress(rs.getString("address"));
            custList.add(cust);
        }
        return Collections.unmodifiableList(custList);
    }

    public Customer getCustomerById(int id) {
        return jdbcTemplate.queryForObject(GET_CUSTOMERBYID, BeanPropertyRowMapper.newInstance(Customer.class), id);
    }

}