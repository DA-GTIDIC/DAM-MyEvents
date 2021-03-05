package cat.udl.tidic.amd.myevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InitialActivity extends TracerActivity {

    private Button startButton;
    private TextView createdEvents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        startButton = findViewById(R.id.button_start);
        createdEvents = findViewById(R.id.created_events);

        Log.d(TAG,"Linking view to activity");
        createdEvents.setText("Log: " + super.counter.getCounter());

    }

    @Override
    protected void onStart() {
        super.onStart();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Starting a new activity");
                Intent intent = new Intent(getApplicationContext(), EventFormActivity.class);
                startActivity(intent);
            }
        });
    }
}