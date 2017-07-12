package com.example.mschmidt.earthdawntest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView totalTextView;
    EditText percentageTxt;
    EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentageTxt = (EditText) findViewById(R.id.percentageTxt);
        numberTxt = (EditText) findViewById(R.id.numberTxt);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float percentage = Float.parseFloat(percentageTxt.getText().toString());
                float dec = percentage / 100;
                float total = dec * Float.parseFloat(numberTxt.getText().toString());
                totalTextView.setText(Float.toString(total));
            }
        });


    }
}
