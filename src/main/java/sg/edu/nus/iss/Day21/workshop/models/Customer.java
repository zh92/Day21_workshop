package sg.edu.nus.iss.Day21.workshop.models;

public class Customer {
    
    private Integer id;
    private String company;
    private String firstName;
    private String lastName;
    private String address;
    
    public Customer() {
    }
    
    public Customer(Integer id, String company, String firstName, String lastName, String address) {
        this.id = id;
        this.company = company;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", company=" + company + ", firstName=" + firstName + ", lastName=" + lastName
                + ", address=" + address + "]";
    }

    
    
}
