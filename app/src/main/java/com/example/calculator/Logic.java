package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Logic extends AppCompatActivity {

    public ArrayList<Integer> convert(String s){
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        return arr;
    }
    public String operation(ArrayList<Integer>a1,ArrayList<Integer>a2,String op){
        ArrayList<Integer>arr=new ArrayList<>();
        String s="";
        if(op.equals("And")){
            for(int i=0;i<a1.size();i++){
                s+=String.valueOf(a1.get(i)&a2.get(i));
            }
        }
        if(op.equals("Or")){
            for(int i=0;i<a1.size();i++){
                s+=String.valueOf(a1.get(i)|a2.get(i));
            }
        }
        if(op.equals("xor")){
            for(int i=0;i<a1.size();i++){
                s+=String.valueOf(a1.get(i)^a2.get(i));

            }
        }

        return s;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logic);
        Button button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    RadioGroup radioGroup=findViewById(R.id.radioGroup);
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    RadioButton radioButton =  findViewById(selectedId);

                    if(selectedId==-1){
                        Toast.makeText(view.getContext(), "Select option", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        EditText editText1=findViewById(R.id.editText1);
                        EditText editText2=findViewById(R.id.editText2);
                        ArrayList<Integer>a1=convert(String.valueOf(editText1.getText()));
                        ArrayList<Integer>a2=convert(String.valueOf(editText2.getText()));
                        if(a1.size()==a2.size()) {
                            if (radioButton.getText().equals("And")) {
                                TextView textView = findViewById(R.id.Ans);
                                String ans = operation(a1, a2, "And");
                                textView.setText(ans);
                                Toast.makeText(view.getContext(), ans, Toast.LENGTH_SHORT).show();
                            }
                            if (radioButton.getText().equals("Or")) {
                                TextView textView = findViewById(R.id.Ans);
                                String ans = operation(a1, a2, "Or");
                                textView.setText(ans);
                                Toast.makeText(view.getContext(), ans, Toast.LENGTH_SHORT).show();
                            }
                            if (radioButton.getText().equals("xor")) {
                                TextView textView = findViewById(R.id.Ans);
                                String ans = operation(a1, a2, "xor");
                                textView.setText(ans);
                                Toast.makeText(view.getContext(), ans, Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(view.getContext(),"check input", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                catch (Exception e){
                    Toast.makeText(view.getContext(),"Error occurred", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}