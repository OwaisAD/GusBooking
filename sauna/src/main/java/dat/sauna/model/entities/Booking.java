package dat.sauna.model.entities;

import java.sql.Timestamp;

public class Booking {
    private int booking_id;
    private int customer_id;
    private int event_id;
    private boolean confirmation;
    private int quantity;
    private Timestamp created;

    public Booking(int booking_id, int customer_id, int event_id, boolean confirmation, int quantity, Timestamp created) {
        this.booking_id = booking_id;
        this.customer_id = customer_id;
        this.event_id = event_id;
        this.confirmation = confirmation;
        this.quantity = quantity;
        this.created = created;
    }

    public Booking(int customer_id, int event_id, boolean confirmation, int quantity, Timestamp created) {
        this.customer_id = customer_id;
        this.event_id = event_id;
        this.confirmation = confirmation;
        this.quantity = quantity;
        this.created = created;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public int getQuantity() {
        return quantity;
    }

    public Timestamp getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", customer_id=" + customer_id +
                ", event_id=" + event_id +
                ", confirmation=" + confirmation +
                ", quantity=" + quantity +
                ", created=" + created +
                '}';
    }
}
