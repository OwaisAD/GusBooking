package dat.sauna.model.entities;

import java.sql.Timestamp;

public class Customer {

    private int customer_id;
    private String phone;
    private String name;
    private Timestamp created;

    public Customer(int customer_id, String phone, String name, Timestamp created) {
        this.customer_id = customer_id;
        this.phone = phone;
        this.name = name;
        this.created = created;
    }

    public Customer(String phone, String name, Timestamp created) {
        this.phone = phone;
        this.name = name;
        this.created = created;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Timestamp getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", created=" + created +
                '}';
    }
}
