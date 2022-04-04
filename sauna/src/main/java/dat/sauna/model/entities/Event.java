package dat.sauna.model.entities;

import java.util.Date;

public class Event {

    private int event_id;
    private String name;
    private int duration;
    private int price;
    private int limit;
    private Date date;
    private int location_id;

    public Event(int event_id, String name, int duration, int price, int limit, Date date, int location_id) {
        this.event_id = event_id;
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.limit = limit;
        this.date = date;
        this.location_id = location_id;
    }

    public Event(String name, int duration, int price, int limit, Date date, int location_id) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.limit = limit;
        this.date = date;
        this.location_id = location_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public int getLimit() {
        return limit;
    }

    public Date getDate() {
        return date;
    }

    public int getLocation_id() {
        return location_id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "event_id=" + event_id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", limit=" + limit +
                ", date=" + date +
                ", location_id=" + location_id +
                '}';
    }
}
