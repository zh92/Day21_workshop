package sg.edu.nus.iss.Day21.workshop.models;

import java.time.LocalDateTime;

public class Order {
    
    private Integer id;
    private Integer customerId;
    private LocalDateTime orderDate;
    private LocalDateTime shippedDate;
    private String shipName;
    
    public Order() {
    }
    
    public Order(Integer id, Integer customerId, LocalDateTime orderDate, LocalDateTime shippedDate, String shipName) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.shipName = shipName;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    public LocalDateTime getShippedDate() {
        return shippedDate;
    }
    public void setShippedDate(LocalDateTime shippedDate) {
        this.shippedDate = shippedDate;
    }
    public String getShipName() {
        return shipName;
    }
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", customerId=" + customerId + ", orderDate=" + orderDate + ", shippedDate="
                + shippedDate + ", shipName=" + shipName + "]";
    }

    
}
