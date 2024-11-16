package com.example.longhnph55234assignmentresapigd1.screens;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.longhnph55234assignmentresapigd1.R;

public class Register extends AppCompatActivity {

    private CheckBox rememberMeCheckBox;
    private EditText emailEditText, passwordEditText;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);



        // Ánh xạ
        rememberMeCheckBox = findViewById(R.id.remember_me_checkbox);
        emailEditText = findViewById(R.id.email_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        Button signupButton = findViewById(R.id.sign_up_button);
        TextView navigateToLogin = findViewById(R.id.navigate_to_login);

        sharedPreferences = getSharedPreferences("pre", MODE_PRIVATE);
        checkRemember();
        rememberMeCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                savePass();
            } else {
                clearPass();
            }
        });

        signupButton.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        navigateToLogin.setOnClickListener(v -> {
            startActivity(new Intent(this, Login.class));
        });
    }

    private void checkRemember() {
        // Kiểm tra dữ liệu đã lưu trong SharedPreferences
        String savedEmail = sharedPreferences.getString("email", null);
        String savedPassword = sharedPreferences.getString("password", null);

        if (savedEmail != null && savedPassword != null) {
            emailEditText.setText(savedEmail);
            passwordEditText.setText(savedPassword);
            rememberMeCheckBox.setChecked(true);
        }
    }

    private void savePass() {
        // Lưu thông tin vào SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("email", emailEditText.getText().toString());
        editor.putString("password", passwordEditText.getText().toString());
        editor.apply();
    }

    private void clearPass() {
        // Xóa thông tin đã lưu
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove("email");
        editor.remove("password");
        editor.apply();
    }
}