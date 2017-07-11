package com.example.skole.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by skole on 11.07.2017.
 */

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Vibrator vib = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        if(Settings.System.getInt(context.getContentResolver(),
                Settings.System.AIRPLANE_MODE_ON, 0) != 0){
            vib.vibrate(2000);
            Log.d("vibrate","çalişti");
            Toast.makeText(context, "Plane mode on", Toast.LENGTH_LONG).show();
        }
        else{
            vib.vibrate(2000);
            Log.d("vibrate","çalişti");
            Toast.makeText(context, "Plane mode off", Toast.LENGTH_LONG).show();
        }

    }
}
