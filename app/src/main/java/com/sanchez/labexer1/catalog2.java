package com.sanchez.labexer1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;


public class catalog2 extends IntentService{
    public catalog2() {
        super("CustomService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Service", "SERVICE RUNNING AT THE SPEED OF SOUND");
    }
}
