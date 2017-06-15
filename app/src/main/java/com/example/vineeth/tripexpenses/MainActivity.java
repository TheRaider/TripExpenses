package com.example.vineeth.tripexpenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String TripName;

    Button submitButton;
    TextView yahoo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().setTitle("Home");

        }

        submitButton = (Button) findViewById(R.id.submitButton);
        yahoo = (TextView) findViewById(R.id.yahoo);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yahoo.setText("Button is pressed");
            }
        });

    }
}
