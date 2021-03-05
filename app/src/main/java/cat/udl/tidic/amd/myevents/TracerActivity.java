package cat.udl.tidic.amd.myevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import cat.udl.tidic.amd.myevents.models.Counter;

public class TracerActivity extends AppCompatActivity {

    String TAG = this.getClass().getName();
    Counter counter = Counter.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracer);
        Log.d(TAG, "onCreate() state.");
        Toast.makeText(getApplicationContext(), TAG + " -> onCreate() state.", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() state.");
        Toast.makeText(getApplicationContext(), TAG + " -> onStart() state.", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() state.");
        Toast.makeText(getApplicationContext(), TAG + " -> onResume() state.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() state.");
        Toast.makeText(getApplicationContext(), TAG + " -> onPause() state.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() state.");
        Toast.makeText(getApplicationContext(), TAG + " -> onStop() state.", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() state.");
        Toast.makeText(getApplicationContext(), TAG + " -> onDestroy() state.", Toast.LENGTH_LONG).show();
    }

}