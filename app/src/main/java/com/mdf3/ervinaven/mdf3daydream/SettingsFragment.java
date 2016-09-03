/**
 * Name: Ervin Avendano
 * Class: Mobile Development Frameworks 3 (MDF3) - Online 1511
 * Project 4 Extra Credit - Daydream
 *
 * @author Ervin Avendano
 */

package com.mdf3.ervinaven.mdf3daydream;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by ervinaven on 11/19/15.
 */
public class SettingsFragment extends PreferenceFragment {

    public static final String TAG = "com.mdf3.ervinaven.mdf3daydream.SettingsFragment.TAG";
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load preference xml file
        addPreferencesFromResource(R.xml.settings);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //context = getActivity().getApplicationContext();
        //SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        //int prefValue = sharedPreferences.getInt("PREF_LIST", 1);


        /*final Preference preference = findPreference("PREF_LIST");
        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference pref) {

                if (pref.getKey().equals("PREF_LIST")) {



                }

                return true;
            }
        });*/


    }

}
