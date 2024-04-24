package com.example.examlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Exam> list;
    ExamAdapter adapter;
    RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = ListExam();
        view = findViewById(R.id.)

    }
    ArrayList<Exam> ListExam(){
        ArrayList<Exam> list1 = new ArrayList<>();
        Exam ex1 = new Exam("First Exam","Best of Luck",2019,05,02);
        Exam ex2 = new Exam("Second Exam","B of l",2010,02,12);
        Exam ex3 = new Exam("My Test Exam","This is testing exam",2019,12,02);
        list1.add(ex1);
        list1.add(ex2);
        list1.add(ex3);
        return list1;
    }
}