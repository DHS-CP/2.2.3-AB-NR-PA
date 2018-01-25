package examples.pltw.org.collegeapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class FamilyListFragment extends ListFragment { // Step 17 implemented in line 7
    private static final String TAG = FamilyListFragment.class.getName(); // Step 19 implemented in line 8
    private static Family mFamily; // Step 20 implemented in line 9

    public FamilyListFragment(){ // Step 21 implemented in lines 11-13
        mFamily = Family.get(); // Step 22 implemented in line 12
    }

    @Override
    public void onCreate(Bundle savedInstanceState) { // Step 23 implemented in lines 17-23
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.family_members_title);

        FamilyMemberAdapter adapter = new FamilyMemberAdapter(mFamily.getFamily());
        setListAdapter(adapter);
    }

    private class FamilyMemberAdapter extends ArrayAdapter<FamilyMember> { // Step 24 implemented in lines 27-48
        public FamilyMemberAdapter(ArrayList<FamilyMember> family) {
            super(getActivity(), 0, family);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_family_member, null);
            }

            FamilyMember f = getItem(position);

            TextView nameTextView =
                    (TextView)convertView
                            .findViewById(R.id.family_member_list_item_nameTextView);
            nameTextView.setText(f.getFirstName() + " " + f.getLastName());

            return convertView;
        }
    }
}
