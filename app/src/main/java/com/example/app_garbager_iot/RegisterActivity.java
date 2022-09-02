package com.example.app_garbager_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RegisterActivity extends AppCompatActivity {

    FloatingActionButton flobtnAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        flobtnAtras = findViewById(R.id.btnButonAtras);
        flobtnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

    }
}