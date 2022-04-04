package dat.sauna.model.persistence;

import dat.sauna.model.entities.Booking;
import dat.sauna.model.entities.Customer;
import dat.sauna.model.entities.Event;
import dat.sauna.model.entities.Location;
import dat.sauna.model.exceptions.DatabaseException;

import java.util.List;

public class SaunaMapper implements ISaunaMapper {

    @Override
    public Event getEventById(int eventId) throws DatabaseException {
        return null;
    }

    @Override
    public Location getLocationById(int locationId) throws DatabaseException {
        return null;
    }

    @Override
    public List<Event> getEvents() throws DatabaseException {
        return null;
    }

    @Override
    public Booking createBooking(Booking booking) throws DatabaseException {
        return null;
    }
}
