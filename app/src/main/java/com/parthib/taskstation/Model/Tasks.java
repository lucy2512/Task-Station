package com.parthib.taskstation.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Tasks_DB")
public class Tasks {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "tasks_title")
    String tasks_title;

    @ColumnInfo(name = "tasks_subtitle")
    String tasks_subtitle;

    @ColumnInfo(name = "tasks_data")
    String tasks_data;

    @ColumnInfo(name = "tasks_date")
    String tasks_date;

    @ColumnInfo(name = "tasks_title")
    String tasks_priority;

}
