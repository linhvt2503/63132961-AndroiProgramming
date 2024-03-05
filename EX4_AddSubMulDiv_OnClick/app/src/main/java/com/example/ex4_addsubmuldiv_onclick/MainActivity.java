package com.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Xử lý cộng
    public void XuLyCong(View v){
        //code xử lý cộng
        //b1:Lấy dữ liệu 2 số
        //b1.1:Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3: chuyển dữ liệu từ chuỗi sang số
        float A = Float.parseFloat(soThu1);
        float B = Float.parseFloat(soThu2);
        //tính toán
        float tong = A + B;
        //hiện ra màn hình
        //tìm EditText kết quả
        EditText editTextKQ = (EditText) findViewById(R.id.edtkq);
        //chuẩn bị dữu liệu xuất, biến thành dạng chuỗi
        String kq = String.valueOf(tong);
        //găắn kết quả lên điều khiển
        editTextKQ.setText(kq);
    }
    public void XuLyTru(View v){
        //code xử lý trừ
        //b1:Lấy dữ liệu 2 số
        //b1.1:Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3: chuyển dữ liệu từ chuỗi sang số
        float A = Float.parseFloat(soThu1);
        float B = Float.parseFloat(soThu2);
        //tính toán
        float hieu = A - B;
        //hiện ra màn hình
        //tìm EditText kết quả
        EditText editTextKQ = (EditText) findViewById(R.id.edtkq);
        //chuẩn bị dữu liệu xuất, biến thành dạng chuỗi
        String kq = String.valueOf(hieu);
        //găắn kết quả lên điều khiển
        editTextKQ.setText(kq);
    }
    public void XuLyNhan(View v){
        //code xử lý Nhân
        //b1:Lấy dữ liệu 2 số
        //b1.1:Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3: chuyển dữ liệu từ chuỗi sang số
        float A = Float.parseFloat(soThu1);
        float B = Float.parseFloat(soThu2);
        //tính toán
        float tich = A * B;
        //hiện ra màn hình
        //tìm EditText kết quả
        EditText editTextKQ = (EditText) findViewById(R.id.edtkq);
        //chuẩn bị dữu liệu xuất, biến thành dạng chuỗi
        String kq = String.valueOf(tich);
        //găắn kết quả lên điều khiển
        editTextKQ.setText(kq);
    }
    public void XuLyChia(View v){
        //code xử lý chia
        //b1:Lấy dữ liệu 2 số
        //b1.1:Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3: chuyển dữ liệu từ chuỗi sang số
        float A = Float.parseFloat(soThu1);
        float B = Float.parseFloat(soThu2);
        //tính toán
        float thuong = A / B;
        //hiện ra màn hình
        //tìm EditText kết quả
        EditText editTextKQ = (EditText) findViewById(R.id.edtkq);
        //chuẩn bị dữu liệu xuất, biến thành dạng chuỗi
        String kq = String.valueOf(thuong);
        //găắn kết quả lên điều khiển
        editTextKQ.setText(kq);
    }
}