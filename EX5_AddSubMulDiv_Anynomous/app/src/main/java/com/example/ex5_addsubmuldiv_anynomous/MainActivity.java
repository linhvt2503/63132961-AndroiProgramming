package com.example.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo đối tượng
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    public void timDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);

        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timDieuKhien();

        //gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        //Cách 1
        View.OnClickListener bolangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();

                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float tong = A + B;
                //in kq ra
                String Kq = String.valueOf(tong);
                editTextKQ.setText(Kq);
            }
        };
        nutCong.setOnClickListener(bolangNgheCong);
        //cách 2
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float hieu = A - B;
                //in kq ra
                String Kq = String.valueOf(hieu);
                editTextKQ.setText(Kq);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float tich = A * B;
                //in kq ra
                String Kq = String.valueOf(tich);
                editTextKQ.setText(Kq);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float A = Float.parseFloat(soThu1);
                float B = Float.parseFloat(soThu2);
                float thuong = A / B;
                //in kq ra
                String Kq = String.valueOf(thuong);
                editTextKQ.setText(Kq);
            }
        });
    }
//    public void XuLyCong(View view){
//        String soThu1 = editTextSo1.getText().toString();
//        String soThu2 = editTextSo2.getText().toString();
//
//        float A = Float.parseFloat(soThu1);
//        float B = Float.parseFloat(soThu2);
//        float tong = A + B;
//        //hiện ra màn hình kết quả
//        String KQ = String.valueOf(tong);
//        editTextKQ.setText(KQ);
//    }
//    public void XuLyTru(View view){
//        String soThu1 = editTextSo1.getText().toString();
//        String soThu2 = editTextSo2.getText().toString();
//
//        float A = Float.parseFloat(soThu1);
//        float B = Float.parseFloat(soThu2);
//        float hieu = A - B;
//        //hiện ra màn hình kết quả
//        String KQ = String.valueOf(hieu);
//        editTextKQ.setText(KQ);
//    }
//    public void XuLyNhan(View view){
//        String soThu1 = editTextSo1.getText().toString();
//        String soThu2 = editTextSo2.getText().toString();
//
//        float A = Float.parseFloat(soThu1);
//        float B = Float.parseFloat(soThu2);
//        float tich = A * B;
//        //hiện ra màn hình kết quả
//        String KQ = String.valueOf(tich);
//        editTextKQ.setText(KQ);
//    }
//    public void XuLyChia(View view){
//        String soThu1 = editTextSo1.getText().toString();
//        String soThu2 = editTextSo2.getText().toString();
//
//        float A = Float.parseFloat(soThu1);
//        float B = Float.parseFloat(soThu2);
//        float thuong = A / B;
//        //hiện ra màn hình kết quả
//        String KQ = String.valueOf(thuong);
//        editTextKQ.setText(KQ);
//    }
}