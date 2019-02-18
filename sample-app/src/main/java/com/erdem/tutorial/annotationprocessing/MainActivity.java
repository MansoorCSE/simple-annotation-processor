package com.erdem.tutorial.annotationprocessing;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.erdem.tutorial.randomizer.RandomInt;
import com.erdem.tutorial.randomizer.RandomString;

public class MainActivity extends BaseActivity {

    @RandomString
    String test1;

    @RandomString
    String test2;

    @RandomInt
    int test3;

    @RandomString
    String test4;

    @RandomInt(maxValue = 10)
    int test5;

    @RandomInt(minValue = 100, maxValue = 105)
    int test6;

    @RandomInt(minValue = 500, maxValue = 1000)
    int test7;

    @RandomInt(minValue = 100, maxValue = 101)
    int test8;

    @RandomInt
    int test9;

    @RandomString
    String test10;

    @RandomString( regex = "[a-zA-Z0-9]{6}")
    String test11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.tvtext)).setText(
                "test1 = " + test1 +"\n"+
                "test2 = " + test2+"\n"+
                "test3 = " + test3+"\n"+
                "test4 = " + test4+"\n"+
                "test5 = " + test5+"\n"+
                "test5 = " + test6+"\n"+
                "test7 = " + test7+"\n"+
                "test8 = " + test8+"\n"+
                "test9 = " + test9+"\n"+
                "test10 = " + test10+"\n"+
                "test11 = " + test11);
    }
}
