package com.codebee.mytasks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolderClass> {

    private ArrayList<MyTask> myArr;

    public TaskAdapter(ArrayList<MyTask> myArr) {
        this.myArr = myArr;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task,parent,false);
        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        holder.label_txt.setText(myArr.get(position).getLabel());
        holder.desc_txt.setText(myArr.get(position).getDescription());
        holder.date_txt.setText(myArr.get(position).getDate());
        holder.time_txt.setText(myArr.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return myArr.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{

        public TextView label_txt,desc_txt,date_txt,time_txt;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);

            label_txt = itemView.findViewById(R.id.item_task_label_text);
            desc_txt = itemView.findViewById(R.id.item_task_desc_text);
            date_txt = itemView.findViewById(R.id.item_task_date_text);
            time_txt = itemView.findViewById(R.id.item_task_time_text);
        }
    }
}
