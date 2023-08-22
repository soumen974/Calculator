package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v){
        EditText et1=(EditText)findViewById(R.id.FstNum);
        EditText et2=(EditText)findViewById(R.id.SndNum);
        EditText et3=(EditText)findViewById(R.id.Resultbx);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1+n2;
        et3.setText("Addition:-"+result);
    }

    public void Subtc(View v){
        EditText et1=(EditText)findViewById(R.id.FstNum);
        EditText et2=(EditText)findViewById(R.id.SndNum);
        EditText et3=(EditText)findViewById(R.id.Resultbx);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1-n2;
        et3.setText("Substraction:-"+result);
    }

    public void Multi(View v){
        EditText et1=(EditText)findViewById(R.id.FstNum);
        EditText et2=(EditText)findViewById(R.id.SndNum);
        EditText et3=(EditText)findViewById(R.id.Resultbx);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1*n2;
        et3.setText("Multiplecation:-"+result);
    }

    public void devide(View v){
        EditText et1=(EditText)findViewById(R.id.FstNum);
        EditText et2=(EditText)findViewById(R.id.SndNum);
        EditText et3=(EditText)findViewById(R.id.Resultbx);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1/n2;
        et3.setText("Devision:-"+result);
    }

}