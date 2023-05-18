package com.grozziie.bluetoothsdk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.grozziie.grozziiebluetooth.BluetoothImagePrinting;
import com.grozziie.grozziiebluetooth.InitilizeSDKActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 startActivity(new Intent(getApplicationContext(), InitilizeSDKActivity.class));
        String notifiongettings= String.valueOf(10);
        String noti_number  = "Printer  number : "+notifiongettings;
        NotificationCompat.Builder  builder=new NotificationCompat.Builder(MainActivity.this);
        builder.setAutoCancel(false)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(com.grozziie.grozziiebluetooth.R.drawable.ic_launcher)
                .setTicker("Your printing request is  on processing . \n"+noti_number)
                .setContentTitle("Printer Notification")
                .setContentText("Your printing request is  on processing . \n"+noti_number)
                .setContentInfo("Information");
       Intent intent =new Intent(getApplicationContext(),MainActivity.class);
       intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
       builder.setContentIntent(pendingIntent);
        NotificationManager nm=(NotificationManager)this.getApplicationContext()
                .getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(0,builder.build());



    }
}