package com.teja_kummarikuntla.coffeeevents.util;

import android.app.Activity;
import android.content.SharedPreferences;

public class pref {

    SharedPreferences sharedPreferences;

    public pref(Activity activity) {
        sharedPreferences = activity.getPreferences(Activity.MODE_PRIVATE);

    }
}
