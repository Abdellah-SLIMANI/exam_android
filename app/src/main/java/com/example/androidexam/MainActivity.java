package com.example.androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText editText;
    public String quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
//        editText = findViewById(R.id.textView);
    }

    private void openTheSecondActivity() {
        Intent intent = new Intent(this, montant_a_payer.class);
        startActivity(intent);
    }

}