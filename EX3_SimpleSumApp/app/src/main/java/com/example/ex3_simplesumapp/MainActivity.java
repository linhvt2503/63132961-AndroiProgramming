package com.example.ex3_simplesumapp;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }
    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view){
        //tìm, tham chiếu đến điều khiển trên tập XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtkq);
        //lây dữ liệu về  điều khiển số a
        String StrA = editTextSoA.getText().toString(); //StrA = "2"
        //Lây dữ liệu về  điều khiển số a
        String StrB = editTextSoB.getText().toString(); //StrB = "4"

        //Chuyen dữ liệu sang dạng số
        int soA = Integer.parseInt(StrA); //6
        int soB = Integer.parseInt(StrB); //5
        //Tính toán theo yêu cầu
        int tong = soA + soB; //11
        String StrTong = String.valueOf(tong); //chuyển sang dạng chuỗi
        //Hiện ra màn hình
        editTextKetQua.setText(StrTong);
    }
}