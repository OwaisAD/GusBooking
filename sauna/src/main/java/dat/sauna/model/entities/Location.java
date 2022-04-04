package dat.sauna.model.entities;

public class Location {

    private int location_id;
    private String name;
    private String address;
    private int zip;
    private String city;
    private String gMapLink;

    public Location(String name, String address, int zip, String city, String gmap_link) {
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.gMapLink = gmap_link;
    }

    public int getLocation_id() {
        return location_id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getgMapLink() {
        return gMapLink;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", gMapLink='" + gMapLink + '\'' +
                '}';
    }
}
