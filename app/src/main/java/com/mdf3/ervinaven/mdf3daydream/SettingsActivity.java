/**
 * Name: Ervin Avendano
 * Class: Mobile Development Frameworks 3 (MDF3) - Online 1511
 * Project 4 Extra Credit - Daydream
 *
 * @author Ervin Avendano
 */

package com.mdf3.ervinaven.mdf3daydream;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ervinaven on 11/19/15.
 */
public class SettingsActivity extends AppCompatActivity {

    public static final String TAG = "com.mdf3.ervinaven.mdf3daydream.SettingsActivity.TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.activity_instructions);

        SettingsFragment settingsFragment = new SettingsFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, settingsFragment);
        fragmentTransaction.commit();

    }

}
