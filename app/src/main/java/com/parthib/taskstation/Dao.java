package com.parthib.taskstation;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    //Query to get all the data
    @Query("SELECT * FROM Notes_DB")
    List<Notes> getAllNotes();

    @Insert
    void insertNotes(Notes... notes);

    //Query to delete the note
    @Query("DELETE FROM Notes_DB WHERE id=:id")
    void deleteNotes(int id);

    @Update
    void updateNotes(Notes notes);
}
