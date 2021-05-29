package gcit.edu.todo_23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.ACTION_POWER_CONNECTED;
import static android.content.Intent.ACTION_POWER_DISCONNECTED;

public class MainActivity extends AppCompatActivity {
    private CustomReceiver customReceiver = new CustomReceiver();
    private static final String ACTION_CUSTOM_BROADCAST =
    BuildConfig.APPLICATION_ID + "ACTION_CUSTOM_BROADCAST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter();
        filter.addAction (Intent.ACTION_POWER_DISCONNECTED);
        filter.addAction (Intent.ACTION_POWER_CONNECTED);


        this.registerReceiver(customReceiver,filter);
    }

    @Override
    protected void onDestroy() {
        this.unregisterReceiver(customReceiver);

        super.onDestroy();
        LocalBroadcastManager.getInstance(this).registerReceiver(customReceiver, new IntentFilter(ACTION_CUSTOM_BROADCAST));

    }

    public void sendcustomboardcast(View view) {
        Intent intent = new Intent(ACTION_CUSTOM_BROADCAST);
        LocalBroadcastManager.getInstance(this).registerReceiver(customReceiver, new IntentFilter(ACTION_CUSTOM_BROADCAST));
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);

    }
}