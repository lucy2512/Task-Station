package com.parthib.taskstation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parthib.taskstation.Activity.TaskAdd;
import com.parthib.taskstation.ViewModel.Tasks_ViewModel;

public class MainActivity extends AppCompatActivity {

    Tasks_ViewModel tasks_viewModel;

    FloatingActionButton addtasks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addtasks=findViewById(R.id.addTasks);

        tasks_viewModel= ViewModelProviders.of(this).get(Tasks_ViewModel.class);

        addtasks.setOnClickListener(view -> {
            startActivity(new Intent( MainActivity.this, TaskAdd.class));
        });


        tasks_viewModel.getAllTasks.observe(this,tasks -> {

        });
    }
}