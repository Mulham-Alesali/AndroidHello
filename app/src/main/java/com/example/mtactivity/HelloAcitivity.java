package com.example.mtactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_acitivity);
        if(getIntent().hasExtra("name")){
            TextView tv = (TextView)findViewById(R.id.tv);
            String name = getIntent().getExtras().getString("name");
            tv.setText("Hello " + name);
        }
    }
}
