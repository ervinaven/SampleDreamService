/**
 * Name: Ervin Avendano
 * Class: Mobile Development Frameworks 3 (MDF3) - Online 1511
 * Project 4 Extra Credit - Daydream
 *
 * @author Ervin Avendano
 */

package com.mdf3.ervinaven.mdf3daydream;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.service.dreams.DreamService;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by ervinaven on 11/15/15.
 */
public class MyDreamService extends DreamService {

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInteractive(false);
        setFullscreen(true);
        setContentView(R.layout.daydream_layout);

        ImageView wheel1 = (ImageView)findViewById(R.id.imageViewGear1);
        ImageView wheel2 = (ImageView)findViewById(R.id.imageViewGear2);
        ImageView wheel3 = (ImageView)findViewById(R.id.imageViewGear3);
        Animation animation;

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        String prefString = sharedPref.getString("PREF_LIST", "1");
        int prefValue = Integer.valueOf(prefString);
        //int prefValue = sharedPref.getInt("PREF_LIST", 1);

        if (prefValue == 1) {
            animation = AnimationUtils.loadAnimation(this, R.anim.rotation);
            //animation.reset();
            wheel1.startAnimation(animation);
            wheel2.startAnimation(animation);
            wheel3.startAnimation(animation);
        } else if (prefValue == 2) {
            animation = AnimationUtils.loadAnimation(this, R.anim.rotation_ccw);
            //animation.reset();
            //animation.setRepeatMode(Animation.REVERSE);
            wheel1.startAnimation(animation);
            wheel2.startAnimation(animation);
            wheel3.startAnimation(animation);
        }
    }

    @Override
    public void onDreamingStarted() {

    }

    @Override
    public void onDreamingStopped() {

    }

    @Override
    public void onDetachedFromWindow() {
        // Example: Stop any animations
        super.onDetachedFromWindow();
    }

}
