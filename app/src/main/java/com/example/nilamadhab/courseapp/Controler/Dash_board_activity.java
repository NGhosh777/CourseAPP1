package com.example.nilamadhab.courseapp.Controler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.nilamadhab.courseapp.Data.CourseListAdpter;
import com.example.nilamadhab.courseapp.R;

public class Dash_board_activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    private CourseListAdpter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_activity);

        recyclerView = findViewById(R.id.courserecyclerview);
        adapter = new CourseListAdpter();
        recyclerView.setAdapter(adapter);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
    }
}
