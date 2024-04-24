package com.example.examlist;

import java.util.Calendar;
import java.util.Date;

public class Exam {
    String Title, Note;
    Date date;

    public Exam(String title, String note, int year, int month, int day) {
        Title = title;
        Note = note;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.date = calendar.getTime();
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
