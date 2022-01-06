package com.parthib.taskstation;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Notes_DB")
public class Notes {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "notes_title")
    String notes_title;

    @ColumnInfo(name = "notes_subtitle")
    String notes_subtitle;

    @ColumnInfo(name = "notes_data")
    String notes_data;

    @ColumnInfo(name = "notes_date")
    String notes_date;

    @ColumnInfo(name = "notes_priority")
    String notes_priority;

}
