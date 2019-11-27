package com.example.a1stexampart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Calculator c;
    private EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = new Calculator();
        e1 = findViewById(R.id.op1);
    }

    public void operand(View view) {
        RadioButton even = findViewById(R.id.even);
        RadioButton odd = findViewById(R.id.odd);
        even.setChecked(false);
        odd.setChecked(false);
        EditText e2 = findViewById(R.id.op2);
        Button b = (Button) view;
        String res = c.operate(b.getText().toString(), e1.getText().toString(), e2.getText().toString());
        TextView result = findViewById(R.id.result);
        result.setText(res);
        if (Double.valueOf(res) % 2 == 0) even.setChecked(true);
        else odd.setChecked(true);
    }

    public void memory(View view) {
        Button b = (Button) view;
        String text = b.getText().toString();
        String memres = c.memory(text, e1.getText().toString());
        if (text.equals("mr")) e1.setText(memres);

    }
}
