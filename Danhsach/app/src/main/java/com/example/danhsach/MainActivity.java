package com.example.danhsach;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hiển thị dư liệu vào listview
        ArrayList<String> dstenTinh; //khai báo
        dstenTinh = new ArrayList<String>();//tạo thể hiện cụ thể, xin mới
        //thêm dữ liệu
        dstenTinh.add("Hà Nội");
        dstenTinh.add("Nha Trang");
        dstenTinh.add("Thành phố Hồ Chí Minh");
        dstenTinh.add("Cam Ranh");
        dstenTinh.add("Phú Yên");
        dstenTinh.add("Bình Định");

        ArrayAdapter<String> adapterTinh;
        adapterTinh = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dstenTinh);

        //găns điều khiển
            //tìm điều khiển
        ListView lvtenTinh = findViewById(R.id.dsTT);
        //gắn vào
        lvtenTinh.setAdapter(adapterTinh);
        //lắng nghe và xử lý ng dung tương tác

    }
}