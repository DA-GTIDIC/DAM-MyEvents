package cat.udl.tidic.amd.myevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventDetailActivity extends TracerActivity {

    private TextView eventTextView;
    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        eventTextView = findViewById(R.id.eventTextView);
        createButton = findViewById(R.id.createButton);

        Bundle bundle = getIntent().getExtras();
        String event = bundle.getString("event", "");

        eventTextView.setText(event);
    }

    @Override
    protected void onStart() {
        super.onStart();

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InitialActivity.class);
                EventDetailActivity.super.counter.setCounter(EventDetailActivity.super.counter.getCounter() + 1);
                startActivity(intent);
            }
        });

    }
}