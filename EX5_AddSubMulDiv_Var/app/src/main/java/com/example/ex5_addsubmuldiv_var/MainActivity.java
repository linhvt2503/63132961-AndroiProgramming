package com.example.ex5_addsubmuldiv_var;

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
    EditText editTextSoA;
    EditText editTextSoB;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    public void timDieuKhien() {
        editTextSoA = (EditText) findViewById(R.id.edtSoa);
        editTextSoB = (EditText) findViewById(R.id.edtSob);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);

        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timDieuKhien();

        //gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        nutCong.setOnClickListener(bolangNgheCong);
        nutTru.setOnClickListener(bolangNgheTru);
        nutNhan.setOnClickListener(bolangNgheNhan);
        //nutChia.setOnClickListener(bolangNgheChia);
        //v dụ bộ lắng nghe ẩn danh
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    //Cách 1
    View.OnClickListener bolangNgheCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextSoA.getText().toString();
            String soThu2 = editTextSoB.getText().toString();

            float A = Float.parseFloat(soThu1);
            float B = Float.parseFloat(soThu2);
            float tong = A + B;
            //in kq ra
            String Kq = String.valueOf(tong);
            editTextKQ.setText(Kq);
        }
    };

    //cách 2
    View.OnClickListener bolangNgheTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextSoA.getText().toString();
            String soThu2 = editTextSoB.getText().toString();
            float A = Float.parseFloat(soThu1);
            float B = Float.parseFloat(soThu2);
            float hieu = A - B;
            //in kq ra
            String Kq = String.valueOf(hieu);
            editTextKQ.setText(Kq);
        }
    };
    View.OnClickListener bolangNgheNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextSoA.getText().toString();
            String soThu2 = editTextSoB.getText().toString();
            float A = Float.parseFloat(soThu1);
            float B = Float.parseFloat(soThu2);
            float tich = A * B;
            //in kq ra
            String Kq = String.valueOf(tich);
            editTextKQ.setText(Kq);
        }
    };
    View.OnClickListener bolangNgheChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextSoA.getText().toString();
            String soThu2 = editTextSoB.getText().toString();
            float A = Float.parseFloat(soThu1);
            float B = Float.parseFloat(soThu2);
            float thuong = A / B;
            //in kq ra
            String Kq = String.valueOf(thuong);
            editTextKQ.setText(Kq);
        }
    };
}