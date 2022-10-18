package com.example.sqliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DBHelper dbHelper;
    EditText name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);
        name = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);
    }

    public void click(View view) {

        ContentValues cv = new ContentValues();
        cv.put("Name",name.getText().toString());
        cv.put("Password",password.getText().toString());

        dbHelper.savedt(cv);
        Toast.makeText(this, "egaa", Toast.LENGTH_SHORT).show();
    }
}