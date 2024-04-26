package com.example.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Lấy giá trị tên đăng nhập từ Intent
        String username = getIntent().getStringExtra("username");

        // Hiển thị tên đăng nhập trong TextView
        TextView textViewUsername = findViewById(R.id.tvten);
        textViewUsername.setText("" + username);
    }
}