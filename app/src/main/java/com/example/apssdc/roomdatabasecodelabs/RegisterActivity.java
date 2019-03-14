package com.example.apssdc.roomdatabasecodelabs;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText id,name;
    private StudentsRoomDataBase mRoomDataBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        id=findViewById(R.id.studentid);
        name=findViewById(R.id.studentname);

        mRoomDataBase = Room.databaseBuilder(this,StudentsRoomDataBase.class,"room").allowMainThreadQueries().build();
    }

    public void save(View view) {
        String n=name.getText().toString().trim();
        int sid= Integer.parseInt(id.getText().toString());

        mRoomDataBase.MyDao().insert_data(new StudentsData(sid,n));

        Toast.makeText(this, "Data Inserted Successfully\n"+"Name:"+n+"\n"+"Id:"+sid, Toast.LENGTH_SHORT).show();

        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
