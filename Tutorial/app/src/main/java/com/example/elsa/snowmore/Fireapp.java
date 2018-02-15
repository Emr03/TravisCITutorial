package com.example.elsa.snowmore;

import android.app.Application;


import com.firebase.client.Firebase;

/**
 * Created by elsa on 05/02/18.
 */

public class Fireapp extends Application {
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}

