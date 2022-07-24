package com.example.formregist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rb_l;
    RadioButton rb_p;
    RadioGroup rg;
    private TextView no_1;
    private seekbar seekbar;
    public static final String Kata_Kunci = "com.java.formregis";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}