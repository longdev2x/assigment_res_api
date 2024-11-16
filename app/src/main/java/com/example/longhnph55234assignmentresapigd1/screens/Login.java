package com.example.longhnph55234assignmentresapigd1.screens;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.longhnph55234assignmentresapigd1.R;

public class Login extends AppCompatActivity {
    private EditText emailEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);


        emailEditText = findViewById(R.id.email_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);

        loadEmailPass();

        Button btnSignIn = findViewById(R.id.btn_login);
        TextView navToSignUp = findViewById(R.id.navigate_to_login);

        btnSignIn.setOnClickListener(v -> {
            // Gọi hàm controller xét logic
            startActivity(new Intent(this, MainActivity.class));
        });

        navToSignUp.setOnClickListener(v -> {
            // Gọi hàm controller xét logic
            startActivity(new Intent(this, Register.class));
        });

    }


    private void loadEmailPass() {
        SharedPreferences sharedPreferences = getSharedPreferences("remember", MODE_PRIVATE);
        String savedEmail = sharedPreferences.getString("email", "");
        String savedPassword = sharedPreferences.getString("password", "");
        emailEditText.setText(savedEmail);
        passwordEditText.setText(savedPassword);
    }
}