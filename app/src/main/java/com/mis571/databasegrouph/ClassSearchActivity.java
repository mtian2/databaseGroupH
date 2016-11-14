package com.mis571.databasegrouph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ttlibra on 11/14/16.
 */
public class ClassSearchActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_search);

        final TextView class_textView1 = (TextView) findViewById(R.id.class_textView1);
        final Spinner class_spinner1 = (Spinner) findViewById(R.id.class_spinner1);
        final TextView class_textView2 = (TextView) findViewById(R.id.class_textView2);
        final EditText class_editText1 = (EditText) findViewById(R.id.class_editText1);
        final Button class_button1 = (Button) findViewById(R.id.class_button1);
    }

}
