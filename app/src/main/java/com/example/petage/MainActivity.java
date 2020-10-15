package com.example.petage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public void function(View viewbutton)
    {
        EditText edt=findViewById(R.id.img1);
        int ans= Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(edt.getText().toString());
        TextView result=findViewById(R.id.result);
        result.setText(ans+"");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
