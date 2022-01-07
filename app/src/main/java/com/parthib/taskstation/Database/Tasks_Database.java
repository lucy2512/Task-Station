package com.parthib.taskstation.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.parthib.taskstation.Model.Tasks;
import com.parthib.taskstation.Dao.Tasks_Dao;

@Database(entities = {Tasks.class}, version = 1)
public abstract class Tasks_Database extends RoomDatabase {

    public abstract Tasks_Dao tasks_dao();

    public static Tasks_Database INSTANCE;

    public static Tasks_Database getDBInstance(Context context){

        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),Tasks_Database.class,"Tasks_DB").build();
        }
        return INSTANCE;
    }

}
