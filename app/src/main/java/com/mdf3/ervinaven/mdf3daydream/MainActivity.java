/**
 * Name: Ervin Avendano
 * Class: Mobile Development Frameworks 3 (MDF3) - Online 1511
 * Project 4 Extra Credit - Daydream
 *
 * @author Ervin Avendano
 */

package com.mdf3.ervinaven.mdf3daydream;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "com.mdf3.ervinaven.mdf3daydream.MainActivity.TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.activity_instructions);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment())
                    .commit();
        }

    }
}
