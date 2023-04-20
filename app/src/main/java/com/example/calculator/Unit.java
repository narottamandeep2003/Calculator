package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Unit extends AppCompatActivity {
    private static final String[] paths = {"Meter", "Kilometer","Centimeter","Millimeter"};
    private String sel="Meter";
    private String sel1="Meter";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);
        Spinner spinner=findViewById(R.id.spinner);
        Spinner spinner1=findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,paths);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        sel="Meter";
                        break;
                    case 1:
                        sel="Kilometer";
                        break;
                    case 2:
                        sel="Centimeter";
                        break;
                    case 3:
                        sel="Millimeter";
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        sel1="Meter";
                        break;
                    case 1:
                        sel1="Kilometer";
                        break;
                    case 2:
                        sel1="Centimeter";
                        break;
                    case 3:
                        sel1="Millimeter";
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Button button=findViewById(R.id.button2);
        TextView textView=findViewById(R.id.Ans);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText2);
//                Toast.makeText(Unit.this, String.valueOf(editText.getText()), Toast.LENGTH_SHORT).show();
                float m= Float.valueOf(String.valueOf(editText.getText()));

                try {

                    if(sel.equals("Meter")){

                        if(sel1.equals("Meter")){
                            textView.setText(String.valueOf(m));
                        }
                        if(sel1.equals("Kilometer")){
                            textView.setText(String.valueOf(m/1000));
                        }
                        if(sel1.equals("Centimeter")){
                            textView.setText((String.valueOf(m*100)));
                            Toast.makeText(Unit.this, String.valueOf(editText.getText()), Toast.LENGTH_SHORT).show();
                        }
                        if(sel1.equals("Millimeter")){
                            textView.setText(String.valueOf(m*1000));
                        }
                    }
                    if(sel.equals("Kilometer")){
                        if(sel1.equals("Meter")){
                            textView.setText(String.valueOf(m*1000));
                        }
                        if(sel1.equals("Kilometer")){
                            textView.setText(String.valueOf(m));
                        }
                        if(sel1.equals("Centimeter")){
                            textView.setText(String.valueOf(m*100000));
                        }
                        if(sel1.equals("Millimeter")){
                            textView.setText(String.valueOf(m*1000000));
                        }
                    }
                    if(sel.equals("Centimeter")){
                        if(sel1.equals("Meter")){
                            textView.setText(String.valueOf(m*0.01));
                        }
                        if(sel1.equals("Kilometer")){
                            textView.setText(String.valueOf(m/100000));
                        }
                        if(sel1.equals("Centimeter")){
                            textView.setText(String.valueOf(m));
                        }
                        if(sel1.equals("Millimeter")){
                            textView.setText(String.valueOf(m*10));
                        }
                    }
                    if(sel.equals("Millimeter")){
                        if(sel1.equals("Meter")){
                            textView.setText(String.valueOf(m*0.001));
                        }
                        if(sel1.equals("Kilometer")){
                            textView.setText(String.valueOf(m/1000000));
                        }
                        if(sel1.equals("Centimeter")){
                            textView.setText(String.valueOf(m*.01));
                        }
                        if(sel1.equals("Millimeter")){
                            textView.setText(String.valueOf(m));
                        }
                    }


                }
                catch (Exception e){
                    Toast.makeText(Unit.this, "Error occurred", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}