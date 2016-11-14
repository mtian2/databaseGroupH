package com.mis571.databasegrouph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ttlibra on 11/13/16.
 */
public class RoomSelectionPage extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_selection);

        final TextView room_textView1 = (TextView) findViewById(R.id.room_textView1);
        final DatePicker room_datePicker1 = (DatePicker) findViewById(R.id.room_datePicker1);
        final TextView room_textView2 = (TextView) findViewById(R.id.room_textView2);
        final Spinner room_spinner1 = (Spinner) findViewById(R.id.room_spinner1);
        final TextView room_textView3 = (TextView) findViewById(R.id.room_textView3);
        final Spinner room_spinner2 = (Spinner) findViewById(R.id.room_spinner2);
        final Button room_button1 = (Button) findViewById(R.id.room_button1);
    }

}
