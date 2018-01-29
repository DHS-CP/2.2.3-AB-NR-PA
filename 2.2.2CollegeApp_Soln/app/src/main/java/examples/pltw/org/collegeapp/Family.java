package examples.pltw.org.collegeapp;

import java.util.ArrayList;

/**
 * Created by baaka on 1/24/2018.
 */

public class Family extends ArrayList<FamilyMember> {
    private static final String TAG = "Family"; // step 3
    ArrayList<FamilyMember> family = new ArrayList(); // step 4
    private static Family sFamily; // step 6

    private Family() { // step 7
        Guardian g1 = new Guardian("first", "last");
        Guardian g2 = new Guardian();
        family.add(g1); // step 10
        family.add(g2);
    }

    public static Family get() { // step 12
        try {
            return sFamily; // step 14
        } // step 13

        catch (NullPointerException e) {
            sFamily = new Family(); // step 15
            return sFamily;
        }


    }

    public static void setsFamily(Family sFamily) {
        Family.sFamily = sFamily;
    }

    public ArrayList<FamilyMember> getFamily() { // step 16
        return family;
    }

    public void setFamily(ArrayList<FamilyMember> family) {
        this.family = family;
    }
}
