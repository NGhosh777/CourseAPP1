package com.example.nilamadhab.courseapp.Data;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nilamadhab.courseapp.MOdel.Course;
import com.example.nilamadhab.courseapp.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

import java.util.ArrayList;

public class CourseListAdpter  extends RecyclerView.Adapter<CourseListAdpter.ViewHolder>{
    @NonNull

    //private ArrayList<Course> courseArrayList;

    private Coursedata coursedata = new Coursedata();
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View Courserow = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_row,parent,false);

        return new ViewHolder(Courserow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Course course = coursedata.courseArrayList().get(position);
        holder.coursetitle.setText(course.getCoursename());
        Picasso.get().load(course.getImageresourceid(holder.coursetitle.getContext())).into(holder.courseimage);
        Picasso.get().load(course.getImageresourceid(holder.coursetitle.getContext())).into(holder.authorimage);

    }

    @Override
    public int getItemCount() {
        return coursedata.courseArrayList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView coursetitle;
        private ImageView courseimage,authorimage;

        public ViewHolder(View itemView) {
            super(itemView);

            authorimage = itemView.findViewById(R.id.authorimageid);
        }
    }
}
