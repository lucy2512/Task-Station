package com.parthib.taskstation.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.parthib.taskstation.Repository.Tasks_Repository;
import com.parthib.taskstation.Model.Tasks;

import java.util.List;

public class Tasks_ViewModel extends AndroidViewModel {

    public Tasks_Repository repository;
    public LiveData<List<Tasks>> getAllTasks;

    public Tasks_ViewModel( Application application) {
        super(application);

        repository = new Tasks_Repository(application);
        getAllTasks = repository.getAllTasks;
    }
    void insertTask(Tasks tasks){
        repository.insertTasks(tasks);
    }
    void deleteTask(int id){
        repository.deleteTasks(id);
    }

    void updateTask(Tasks tasks){
        repository.updateTasks(tasks);
    }
}
