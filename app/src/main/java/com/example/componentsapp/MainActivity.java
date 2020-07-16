package com.example.componentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    Switch s1;
    Button b1;
    ToggleButton t1;
    FloatingActionButton f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = findViewById(R.id.switch1);
        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.toggleButton);
        f1=findViewById(R.id.fAB1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.isChecked()) {
                    b1.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Switch On", Toast.LENGTH_LONG).show();
                } else {
                    b1.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Switch Off", Toast.LENGTH_LONG).show();
                }

            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.isChecked()) {
                    b1.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Switch On", Toast.LENGTH_LONG).show();
                } else {
                    b1.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Switch Off", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void btn(View view) {
        if(f1.isClickable())
        {
            Toast.makeText(getApplicationContext(),"Clickable",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Not Clickable",Toast.LENGTH_LONG).show();

        }
    }
}