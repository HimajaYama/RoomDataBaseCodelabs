package com.example.apssdc.roomdatabasecodelabs;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "NecStudentsData")
public class StudentsData
{
    @PrimaryKey
    int student_id;
    String student_name;

    public StudentsData(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}
