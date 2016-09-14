package com.example.servicetask;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.media.MediaBrowserCompat;

/**
 * Created by Hp on 06-Aug-16.
 */
public class MyService extends Service {
    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public  void onCreate(){
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.thum);
        super.onCreate();
    }
    public int onStartCommand(Intent intent,int flags,int startId){
        mediaPlayer.start();
        return super.onStartCommand(intent,flags,startId);
    }
    public void onDestroy(){
        mediaPlayer.stop();
        super.onDestroy();
    }
}
