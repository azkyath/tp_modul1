package com.example.android.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText menuj;
    private EditText portion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchThird(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        menuj = (EditText) findViewById(R.id.editText);
        String dinner = menuj.getText().toString();

        portion = (EditText) findViewById(R.id.editText2);
        String porzi = portion.getText().toString();

        intent.putExtra("tempat","Eatbus");
        intent.putExtra("menu", dinner);
        intent.putExtra("porsi", porzi);
        intent.putExtra("harga", "45000");
        startActivity(intent);
    }

    public void launchSecond(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        menuj = (EditText) findViewById(R.id.editText);
        String dinner = menuj.getText().toString();

        portion = (EditText) findViewById(R.id.editText2);
        String porzi = portion.getText().toString();

        intent.putExtra("tempat","Abnormal");
        intent.putExtra("menu", dinner);
        intent.putExtra("porsi", porzi);
        intent.putExtra("harga", "50000");
        startActivity(intent);
    }
}
