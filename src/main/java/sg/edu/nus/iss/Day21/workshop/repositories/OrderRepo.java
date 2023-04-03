package sg.edu.nus.iss.Day21.workshop.repositories;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.Day21.workshop.models.Order;

@Repository
public class OrderRepo {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_ORDERSBYCUSTOMERID = "select id, customer_id, order_date, shipped_date, ship_name from orders where customer_id = ?";

    public List<Order> getCustomerOrdersById(int customer_id) {

        final List<Order> orderList = new ArrayList<Order>();

        final SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ORDERSBYCUSTOMERID, customer_id);

        while (rs.next()) {
            Order order = new Order();
            order.setId(rs.getInt("id"));
            order.setCustomerId(rs.getInt("customer_id"));
            order.setOrderDate((LocalDateTime) rs.getObject("order_date"));
            order.setShippedDate((LocalDateTime) rs.getObject("ship_date"));
            order.setShipName(rs.getString("ship_name"));
            orderList.add(order);
        }
        return Collections.unmodifiableList(orderList);
    }
}
