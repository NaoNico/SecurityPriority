package julianocamilo.securitypriority.Model;

import java.util.Date;

public class Notification {
    private String context;
    private Location location;
    private City city;
    private User user;
    private Type type;
    private Date dateTime;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
