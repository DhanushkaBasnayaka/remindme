package com.Dhanushka.remindme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class AlarmReceiver extends BroadcastReceiver {

    String TAG = "AlarmReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub

        if (intent.getAction() != null && context != null) {
            if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
                // Set the alarm here.
                LocalData localData = new LocalData(context);
//dccd
                return;
            }

        }
        int valal =intent.getIntExtra("frgggrgg",-1);
        int itrHour =intent.getIntExtra("itrHour",-1);
        Log.d(TAG, "onReceive:"+valal+"=="+itrHour);

        //Trigger the notification
        NotificationScheduler.showNotification(context, "You have 5 unwatched videos", "Watch them now?");

    }
}


