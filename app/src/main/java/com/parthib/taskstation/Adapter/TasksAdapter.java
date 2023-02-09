package com.parthib.taskstation.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.parthib.taskstation.MainActivity;
import com.parthib.taskstation.Model.Tasks;
import com.parthib.taskstation.R;

import java.util.List;

public class TasksAdapter  extends RecyclerView.Adapter<TasksAdapter.tasksViewholder> {

    MainActivity mainActivity;
    List<Tasks> tasks;

    public TasksAdapter(MainActivity mainActivity, List<Tasks> tasks) {
        this.mainActivity=mainActivity;
        this.tasks=tasks;
    }

    @Override
    public tasksViewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new tasksViewholder(LayoutInflater.from(mainActivity).inflate(R.layout.activity_tasks,parent,false));
    }

    @Override
    public void onBindViewHolder( TasksAdapter.tasksViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class tasksViewholder extends RecyclerView.ViewHolder{
        public tasksViewholder (View itemView){
            super(itemView);
        }
    }
}
