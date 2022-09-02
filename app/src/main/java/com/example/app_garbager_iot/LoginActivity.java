package com.example.app_garbager_iot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity
{
    Button btnLogin;
    Button btnSignUp;
    EditText edUserName, edPassword;
    TextView noAccount;

    @Override
    protected  void onCreate(Bundle loginInstance){
        super.onCreate(loginInstance);
        setContentView(R.layout.login);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignUp = findViewById(R.id.btnSignUp);
        edUserName = findViewById(R.id.txtUserName);
        edPassword = findViewById(R.id.txtPassword);
        noAccount = findViewById(R.id.txtNoCount);
        noAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

    }
}
