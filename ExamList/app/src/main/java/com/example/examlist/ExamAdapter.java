package com.example.examlist;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ExamAdapter extends RecyclerView.Adapter<ExamAdapter.ExamHolder> {
    Context context;
    ArrayList<Exam> listE;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd,yyyy");

    public ExamAdapter(Context context, ArrayList<Exam> listE) {
        this.context = context;
        this.listE = listE;
    }

    @NonNull
    @Override
    public ExamHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater tieuDe = LayoutInflater.from(context);
        View vExam = tieuDe.inflate(R.layout.exam_item,parent,false);
        return new ExamHolder(vExam);
    }

    @Override
    public void onBindViewHolder(@NonNull ExamHolder holder, int position) {
        Exam examShow = listE.get(position);
        String Title = examShow.getTitle();
        String Note = examShow.getNote();
        String date = simpleDateFormat.format(examShow.getDate());
        holder.Title.setText(Title);
        holder.Note.setText(Note);
        holder.date.setText(date);
    }

    @Override
    public int getItemCount() {
        return listE.size();
    }
    class ExamHolder extends RecyclerView.ViewHolder{
        TextView Title, Note, date;

        public ExamHolder(@NonNull View itemView) {
            super(itemView);
            Title = itemView.findViewById(R.id.txt_title);
            Note = itemView.findViewById(R.id.txt_note);
            date = itemView.findViewById(R.id.txt_date);
        }
    }
}
