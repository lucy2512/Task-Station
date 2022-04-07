package com.parthib.taskstation.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Tasks_DB")
public class Tasks {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "tasks_title")
    public String tasksTitle;

    @ColumnInfo(name = "tasks_subtitle")
    public String tasksSubtitle;

    @ColumnInfo(name = "tasks_data")
    public String tasksData;

    @ColumnInfo(name = "tasks_date")
    public String tasksDate;

    @ColumnInfo(name = "tasks_priority")
    public String tasksPriority;

}
