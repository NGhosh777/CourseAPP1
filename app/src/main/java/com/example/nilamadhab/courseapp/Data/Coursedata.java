package com.example.nilamadhab.courseapp.Data;

import com.example.nilamadhab.courseapp.MOdel.Course;

import java.util.ArrayList;

public class Coursedata {
    private String[] coursenames = {"First Course","Second Course","Third Course","Fourth Course","Fifth Course",
            "Sixth Course","Seventh Course"};

    public ArrayList<Course> courseArrayList()
    {
        ArrayList<Course> list = new ArrayList<>();
        for(int i=0;i<coursenames.length;i++)
        {
           Course course = new Course(coursenames[i],coursenames[i].replace(" ","").toLowerCase(),"happy_woman");
           list.add(course);
        }
        return list;

    }



}
