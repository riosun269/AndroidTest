package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button helloBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloBtn = findViewById(R.id.helloBtn);

        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScreen2();
            }
        });
    }

    public void openScreen2 (){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
