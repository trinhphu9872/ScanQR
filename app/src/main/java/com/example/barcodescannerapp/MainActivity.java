package com.example.barcodescannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static TextView resText;
    Button scan_btn,toast_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getId();
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ScanActivity.class));
            }
        });
        toast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,resText.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void getId(){
        resText = findViewById(R.id.barcodeTextView);
        scan_btn = (Button) findViewById(R.id.buttonScan);
        toast_btn = (Button) findViewById(R.id.buttonToast);
    }
}