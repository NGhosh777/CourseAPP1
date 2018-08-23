package com.example.nilamadhab.courseapp.MOdel;

import android.content.Context;

public class Course {
    private String Coursename;
    private String Courseimage;
    private String author;

    public int getImageresourceid(Context context)
    {
        return context.getResources().getIdentifier(this.getCourseimage(),"drawable",context.getPackageName());
    }

    public Course(String coursename, String courseimage, String author) {
        Coursename = coursename;
        Courseimage = courseimage;
        this.author = author;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    public String getCourseimage() {
        return Courseimage;
    }

    public void setCourseimage(String courseimage) {
        Courseimage = courseimage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
