package com.example.android.quizzesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.security.PublicKey;

import static android.R.attr.value;
import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void onRadioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    Toast.makeText(this, "You are right", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    Toast.makeText(this, "You are wrong", Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}
