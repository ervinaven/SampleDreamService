/**
 * Name: Ervin Avendano
 * Class: Mobile Development Frameworks 3 (MDF3) - Online 1511
 * Project 4 Extra Credit - Daydream
 *
 * @author Ervin Avendano
 */

package com.mdf3.ervinaven.mdf3daydream;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ervinaven on 11/19/15.
 */
public class MainFragment extends Fragment {

    public static final String TAG = "com.mdf3.ervinaven.mdf3daydream.MainFragment.TAG";
    TextView instructionsText;

    public MainFragment() {

    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        instructionsText = (TextView) getView().findViewById(R.id.mFragmentTextView);
        instructionsText.setText(R.string.daydream_string);
    }

}
