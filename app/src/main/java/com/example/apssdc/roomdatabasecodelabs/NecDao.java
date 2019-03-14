package com.example.apssdc.roomdatabasecodelabs;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface NecDao {

    @Insert
    void insert_data(StudentsData studentsData);
    @Query("Select * from NecStudentsData order by student_name ")
    List<StudentsData> getAllData();


}
