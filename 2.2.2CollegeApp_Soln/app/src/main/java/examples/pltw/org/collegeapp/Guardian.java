package examples.pltw.org.collegeapp;

/**
 * Created by ckinnard on 4/3/2017.
 */
public class Guardian extends FamilyMember {
    private String occupation;

    public Guardian() { // Step 11 implemented in lines 9-12
        super();
    }
    public Guardian (String firstName, String lastName) { // Step 9 implemented in 12-15
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}