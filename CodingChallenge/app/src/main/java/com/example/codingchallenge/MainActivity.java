package com.example.codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Button btn = (Button) (view);
        String text = btn.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "";
        if (text == getString(R.string.label_text_first)) {
            message = getString(R.string.text_one);
        } else if (text == getString(R.string.label_text_second))
            message = getString(R.string.text_two);
        else if (text == getString(R.string.label_text_three))
            message = getString(R.string.text_three);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}