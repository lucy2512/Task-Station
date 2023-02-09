package com.parthib.taskstation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parthib.taskstation.Activity.TaskAdd;
import com.parthib.taskstation.Adapter.TasksAdapter;
import com.parthib.taskstation.ViewModel.Tasks_ViewModel;

public class MainActivity extends AppCompatActivity {

    Tasks_ViewModel tasks_viewModel;

    FloatingActionButton addtasks;
    RecyclerView tasksRecycler;
    TasksAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addtasks=findViewById(R.id.addTasks);
        tasksRecycler=findViewById(R.id.tasks);


        tasks_viewModel= ViewModelProviders.of(this).get(Tasks_ViewModel.class);

        addtasks.setOnClickListener(view -> {
            startActivity(new Intent( MainActivity.this, TaskAdd.class));
        });


        tasks_viewModel.getAllTasks.observe(this,tasks -> {
            tasksRecycler.setLayoutManager(new GridLayoutManager(this,2));
            adapter=new TasksAdapter(MainActivity.this,tasks);
            tasksRecycler.setAdapter(adapter);
        });
    }
}