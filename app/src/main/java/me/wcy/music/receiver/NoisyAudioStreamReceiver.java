package me.wcy.music.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import me.wcy.music.service.PlayService;
import me.wcy.music.utils.Actions;

/**
 * 来电/耳机拔出时暂停播放
 * Created by wcy on 2016/1/23.
 */
public class NoisyAudioStreamReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serviceIntent = new Intent(context, PlayService.class);
        serviceIntent.setAction(Actions.ACTION_MEDIA_PLAY_PAUSE);
        context.startService(serviceIntent);
    }
}
