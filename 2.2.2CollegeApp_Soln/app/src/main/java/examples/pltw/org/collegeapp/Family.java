package examples.pltw.org.collegeapp;

import java.util.ArrayList;

/**
 * Created by baaka on 1/24/2018.
 */

public class Family {
    private static final String TAG = Family.class.getName(); // Step 3 implemented in line 10
    private ArrayList<FamilyMember> family;// Step 4 implemented in line 11
    private static Family sFamily; // Step 6 implemented in line 12

    private Family() {   // Step 7 implemented in lines 14-16
        family = new ArrayList();
        family.add(new Guardian("Calvin", "Brown")); // Step 10 implemented in lines 16-17
        family.add(new Guardian());
    }

    public static Family get() { // Step 12 implemented in line 20
        if (sFamily == null) { // Step 13 implemented in line 21
            Family f = new Family(); // Step 15 implemented in lines 22-23;
            sFamily = f;
        }
        return sFamily; // Step 14 implemented in line 25
    }

    public ArrayList<FamilyMember> getFamily() { // Step 16 implemented in lines 28-35
        return family;
    }

    public void setFamily(ArrayList<FamilyMember> family) {
        this.family = family;
    }
}
