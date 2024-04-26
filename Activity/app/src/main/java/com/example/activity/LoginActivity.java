package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void xuly(View view) {
        EditText adtUserName = findViewById(R.id.adtUserName);
        EditText edtPass = findViewById(R.id.edtPass);

        String username = adtUserName.getText().toString();
        String password = edtPass.getText().toString();

        if (username.equals("vothuylinh") && password.equals("12345")) {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Thông tin đăng nhập không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}