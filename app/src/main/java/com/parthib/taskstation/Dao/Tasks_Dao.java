package com.parthib.taskstation.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.parthib.taskstation.Model.Tasks;

import java.util.List;

@androidx.room.Dao
public interface Tasks_Dao {

    //Query to get all the data
    @Query("SELECT * FROM Tasks_DB")
    LiveData<List<Tasks>> getAllTasks();

    @Insert
    void insertTasks(Tasks... tasks);

    //Query to delete the note
    @Query("DELETE FROM Tasks_DB WHERE id=:id")
    void deleteTasks(int id);

    @Update
    void updateTasks(Tasks notes);
}
