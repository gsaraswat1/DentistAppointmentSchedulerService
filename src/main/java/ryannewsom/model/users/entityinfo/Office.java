package ryannewsom.model.users.entityinfo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Office for a business
 */
public class Office {
    @Id
    private String id;
    private ContactInfo contactInfo;

    /**
     * Constructor
     */
    public Office(){

    }

    /**
     * Constructor
     * @param contactInfo - contact info for the office
     */
    public Office(ContactInfo contactInfo){
        this.contactInfo = contactInfo;
        this.id = ObjectId.get().toString();
    }

    public String getOfficeId() {
        return id;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id='" + id + '\'' +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
