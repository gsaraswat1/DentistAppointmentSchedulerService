package ryannewsom.model.appointment;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import ryannewsom.model.users.User;
import ryannewsom.model.users.entityinfo.Office;

import java.util.Date;

/**
 * Appointment for a service providing business
 */
@Document
public class Appointment implements Comparable<Appointment>{

    @Id
    private String id;
    private User user;
    private Date time;
    private Office office;

    /**
     * Constructor
     */
    public Appointment(){

    }

    /**
     * Constructor
     * @param user - the customer
     * @param time - the time of the appointment
     * @param office - the office for the appointment
     */
    public Appointment(User user, Date time, Office office){
        this.user = user;
        this.time = time;
        this.office = office;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Date getTime() {
        return time;
    }

    public Office getOffice() {
        return office;
    }

    public void setAppointmentId(final String id) {
        this.id = id;
    }

    public String getAppointmentId() {
        return id;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "mId='" + id + '\'' +
                ", mUser=" + user +
                ", mTime=" + time +
                ", mOffice=" + office +
                '}';
    }

    @Override
    public int compareTo(Appointment o) {
        return (int) (time.getTime() - o.time.getTime());
    }
}
