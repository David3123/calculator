//Манвелян Давид 303 группа
package com.example.myapplication.Manvelyan303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.R.id;

public class MainActivity extends AppCompatActivity {

    EditText ta;
    EditText tb;
    TextView lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.txtA);
        tb = findViewById(R.id.txtB);
        lr = findViewById(R.id.labC);

    }
    public void my_add_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = ta.getText().toString();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int c = a + b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }

    public void my_sub_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = ta.getText().toString();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int c = a - b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }

    public void my_mul_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = ta.getText().toString();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int c = a * b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }

    public void my_div_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = ta.getText().toString();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int c = a / b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }
}
//Манвелян Давид 303 группа
