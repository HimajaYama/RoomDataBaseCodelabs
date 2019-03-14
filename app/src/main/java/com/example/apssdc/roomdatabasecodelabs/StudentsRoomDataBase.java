package com.example.apssdc.roomdatabasecodelabs;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {StudentsData.class},version = 1,exportSchema = false)
public abstract class StudentsRoomDataBase extends RoomDatabase {

    public abstract NecDao MyDao();
}
