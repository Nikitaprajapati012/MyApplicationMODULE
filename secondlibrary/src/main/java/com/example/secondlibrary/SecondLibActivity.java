package com.example.secondlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SecondLibActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libsecond);
        Toast.makeText(this, "Hey!!! i am Second Library", Toast.LENGTH_SHORT).show();
    }
}
