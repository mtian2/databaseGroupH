package com.mis571.databasegrouph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        final TextView home_textView1 = (TextView) findViewById(R.id.home_textView1);
        final EditText home_editText1 = (EditText) findViewById(R.id.home_editText1);
        final EditText home_editText2 = (EditText) findViewById(R.id.home_editText2);
        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View v){
            Intent buttonIntent = new Intent(HomepageActivity.this, WelcomepageActivity.class);
            HomepageActivity.this.startActivity(buttonIntent);
        }
    });
}
}

