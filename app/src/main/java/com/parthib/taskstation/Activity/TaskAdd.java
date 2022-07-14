package com.parthib.taskstation.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.Toast;

import com.parthib.taskstation.Model.Tasks;
import com.parthib.taskstation.R;
import com.parthib.taskstation.ViewModel.Tasks_ViewModel;
import com.parthib.taskstation.databinding.ActivityTaskAddBinding;

import java.util.Date;

public class TaskAdd extends AppCompatActivity {

    ActivityTaskAddBinding binding;
    String title,subtitle,task,priority="3";
    Tasks_ViewModel tasks_viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTaskAddBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        tasks_viewModel= ViewModelProviders.of(this).get(Tasks_ViewModel.class);

        binding.greenP.setOnClickListener(v-> {
            binding.greenP.setImageResource(R.drawable.ic_baseline_done_24);
            binding.redP.setImageResource(0);
            binding.yellowP.setImageResource(0);
            priority="3";
        });

        binding.redP.setOnClickListener(v->{
            binding.greenP.setImageResource(0);
            binding.redP.setImageResource(R.drawable.ic_baseline_done_24);
            binding.yellowP.setImageResource(0);
            priority="1";
        });

        binding.yellowP.setOnClickListener(v->{
            binding.greenP.setImageResource(0);
            binding.redP.setImageResource(0);
            binding.yellowP.setImageResource(R.drawable.ic_baseline_done_24);
            priority="2";
        });

        binding.doneTasks.setOnClickListener(v -> {

            title=binding.tasktitle.getText().toString();
            subtitle=binding.tasksubtitle.getText().toString();
            task=binding.Tasksdata.getText().toString();

            CreateTasks(title,subtitle,task);
        });
    }

    private void CreateTasks(String title, String subtitle, String task) {

        Date date= new Date();
        CharSequence sequence= DateFormat.format("MMMM d,YYYY",date.getTime());



        Tasks tasks2 = new Tasks();
        tasks2.tasksTitle=title;
        tasks2.tasksSubtitle=subtitle;
        tasks2.tasksData=task;
        tasks2.tasksDate=sequence.toString();
        tasks2.tasksPriority=priority;
        tasks_viewModel.insertTask(tasks2);


        Toast.makeText(this, "Note Added!", Toast.LENGTH_SHORT).show();
        finish();
    }
}