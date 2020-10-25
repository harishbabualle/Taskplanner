package com.example.taskplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class AddTaskPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task_page);

        TextView NoteScroll = (TextView)findViewById(R.id.noteEditText);

        NoteScroll.setMovementMethod(new ScrollingMovementMethod());
    }
}