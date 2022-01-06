package com.parthib.taskstation.Model.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.parthib.taskstation.Dao.Tasks_Dao;
import com.parthib.taskstation.Database.Tasks_Database;
import com.parthib.taskstation.Model.Tasks;

import java.util.List;

public class Tasks_Repository {

    public Tasks_Dao tasks_dao;
    public LiveData<List<Tasks>> getAllTasks;


    public Tasks_Repository(Application application) {
        Tasks_Database database = Tasks_Database.getDBInstance(application);
        tasks_dao = database.tasks_dao();
        getAllTasks = tasks_dao.getAllTasks();
    }

    void insertTasks(Tasks tasks){
        tasks_dao.insertTasks(tasks);
    }

    void deleteTasks(int id){
        tasks_dao.deleteTasks(id);
    }

    void updateTasks(Tasks tasks){
        tasks_dao.updateTasks(tasks);
    }
}
