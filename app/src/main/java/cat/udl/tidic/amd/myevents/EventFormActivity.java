package cat.udl.tidic.amd.myevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

import cat.udl.tidic.amd.myevents.models.Event;

public class EventFormActivity extends TracerActivity {

    private EditText descriptionEditText;
    private EditText nameEditText;
    private DatePicker startDatePicker;
    private DatePicker endDatePicker;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_form);

        nameEditText = findViewById(R.id.nameEditText);
        descriptionEditText = findViewById(R.id.descriptionEditText);
        startDatePicker = findViewById(R.id.startDatePicker);
        endDatePicker = findViewById(R.id.endDatePicker);
        checkButton = findViewById(R.id.buttonCheck);
    }

    @Override
    protected void onStart() {
        super.onStart();

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String description = descriptionEditText.getText().toString();
                Calendar c = Calendar.getInstance();
                c.set(startDatePicker.getYear(), startDatePicker.getMonth(),
                        startDatePicker.getDayOfMonth());
                Date start = new Date(c.getTimeInMillis());
                c.set(endDatePicker.getYear(), endDatePicker.getMonth(),
                        endDatePicker.getDayOfMonth());
                Date end = new Date(c.getTimeInMillis());

                Event event = new Event(name,description,start,end);

                Intent intent = new Intent(getApplicationContext(), EventDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("event", event.toString());
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }
}