package id.sch.smktelkom_mlg.learn.activitylivecycle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LivevycleTag";
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        Log.d(TAG, "onCreate: ");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume :");
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onCreate: ");
        mediaPlayer.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onCreate: ");
        if (mediaPlayer != null)
            mediaPlayer.release();
    }
}
