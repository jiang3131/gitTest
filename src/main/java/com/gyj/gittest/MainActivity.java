package com.gyj.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("git2");
        System.out.println("git3");
        System.out.println("master test");
        System.out.println("mastertwo test");
        System.out.println("push test");
        System.out.println("pull test");

    }
}
