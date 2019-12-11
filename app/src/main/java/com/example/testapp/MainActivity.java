package com.example.testapp;

//AndroidX
import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private MyApp myApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myApp = (MyApp) this.getApplication();


        Button buttonMain = findViewById(R.id.button_main);
        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double message =  36.56248397073886;
                double message1 =  139.88580666482449;
                myApp.setTestString(message);
                myApp.setTestString1(message1);

                Intent intent = new Intent(getApplication(), MapsActivity.class);
                startActivity( intent );
            }
        });
    }
}