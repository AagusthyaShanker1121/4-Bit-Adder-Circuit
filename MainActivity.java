package com.example.distanceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView ;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button ;
    private TextView textview ;
    private EditText inputText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textview) ;
        inputText = findViewById(R.id.inputText) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, " Conversion in Process ! ", Toast.LENGTH_SHORT).show();
                String s = inputText.getText().toString() ;
                double km = Double.parseDouble(s) ;
                double meters = km * 1000 ;
                String ans ;
                if(meters == 1.0) ans = "Meter" ;
                else ans = "Meters" ;
                textview.setText(meters + "    " + ans);
            }
        });

    }
}