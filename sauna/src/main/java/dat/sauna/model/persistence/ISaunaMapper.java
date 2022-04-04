package dat.sauna.model.persistence;


import dat.sauna.model.entities.Booking;
import dat.sauna.model.entities.Customer;
import dat.sauna.model.entities.Event;
import dat.sauna.model.entities.Location;
import dat.sauna.model.exceptions.DatabaseException;

import java.util.List;

public interface ISaunaMapper
{

    //hent event ud fra et specifikt id
    public Event getEventById(int eventId) throws DatabaseException;

    //hent location ud fra et specifikt id
    public Location getLocationById(int locationId) throws DatabaseException;

    //hent alle events ud
    public List<Event> getEvents() throws DatabaseException;

    //lav en booking
    public Booking createBooking(Booking booking) throws DatabaseException;

    //
}
