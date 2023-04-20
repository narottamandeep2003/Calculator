package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class cal extends AppCompatActivity {
    int precedence(char operator)
    {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    ArrayList<String> infixToPostfix(ArrayList<String> a1)
    {
        ArrayList<String> ans=new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < a1.size(); ++i) {
            String s=a1.get(i);
            if (!s.equals("-")&&!s.equals("+")&&!s.equals("*")&&!s.equals("/")){
                ans.add(s);
            } else if (s.equals("(")) {
                stack.push(s);
            }
            else if (s.equals(")")) {
                while (!stack.isEmpty()
                        && !stack.peek().equals("(")) {
                    ans.add(stack.peek());
                    stack.pop();
                }

                stack.pop();
            }
            else
            {
                while (!stack.isEmpty()
                        && precedence(s.charAt(0)) <= precedence(stack.peek().charAt(0))) {

                    ans.add(stack.peek());
                    stack.pop();
                }
                stack.push(s);
            }

        }
        while (!stack.isEmpty()) {
            if (stack.peek().equals("("))
                return null;
            ans.add(stack.peek());
            stack.pop();
        }

        for(int i=0;i<ans.size();i++){
            Log.d("t", ans.get(i));
        }
        return ans;


    }
    String evaluatePostfix(ArrayList<String>arr)
    {
        // Create a stack
        Stack<String> stack = new Stack<>();

        try {


            for (int i = 0; i < arr.size(); i++) {
                String s = arr.get(i);


                if (!s.equals("-") && !s.equals("+") && !s.equals("*") && !s.equals("/")) {
                    stack.push(s);
                } else {
                    float val1 = Float.valueOf(stack.pop());
                    float val2 = Float.valueOf(stack.pop());
                    ;
                    char c = s.charAt(0);
                    switch (c) {
                        case '+':
                            stack.push(String.valueOf(val2 + val1));
                            break;
                        case '-':
                            stack.push(String.valueOf(val2 - val1));
                            break;
                        case '/':
                            stack.push(String.valueOf(val2 / val1));
                            break;
                        case '*':
                            stack.push(String.valueOf(val2 * val1));
                            break;
                    }
                }
            }

            return stack.pop();
        }
        catch (Exception e){
            return  null;
        }
    }
    String result(String s){
        ArrayList<String>arr=new ArrayList<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='('||s.charAt(i)==')'){
                if(temp.length()==0){
                    return null;
                }
                arr.add(temp);
                arr.add(String.valueOf(s.charAt(i)));
                temp="";
            }
            else {
                temp += s.charAt(i);
            }
        }
        arr.add(temp);
        ArrayList<String>arr1= infixToPostfix(arr);
        return evaluatePostfix(arr1);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        TextView textView=findViewById(R.id.textView);
        Button btn1=findViewById(R.id.button8);
        Button btn2=findViewById(R.id.button9);
        Button btn3=findViewById(R.id.button24);
        Button btn4=findViewById(R.id.button11);
        Button btn5=findViewById(R.id.button12);
        Button btn6=findViewById(R.id.button13);
        Button btn7=findViewById(R.id.button14);
        Button btn8=findViewById(R.id.button15);
        Button btn9=findViewById(R.id.button16);
        Button btn10=findViewById(R.id.button17);
        Button btn11=findViewById(R.id.button18);
        Button btn12=findViewById(R.id.button19);
        Button btn13=findViewById(R.id.button20);
        Button btn14=findViewById(R.id.button21);
        Button btn15=findViewById(R.id.button22);
        Button btn16=findViewById(R.id.button23);
        Button btn17=findViewById(R.id.button25);
        Button btn18=findViewById(R.id.button26);
        Button btn19=findViewById(R.id.button27);
        Button btn20=findViewById(R.id.button28);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn19.getText())));
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn20.getText())));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn1.getText())));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn2.getText())));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn3.getText())));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn4.getText())));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn5.getText())));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn6.getText())));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn7.getText())));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn9.getText())));
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn10.getText())));
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn11.getText())));
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn12.getText())));
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn13.getText())));
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn14.getText())));
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn15.getText())));
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(textView.getText()+String.valueOf(btn17.getText())));
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(""));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()!=0) {
                    textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() - 1));
                }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=textView.getText().toString();
                if(s.length()!=0){
                 s=result(s);
                 if(s==null){
                     textView.setText("");
                     Toast.makeText(view.getContext(), "Error Occurred", Toast.LENGTH_SHORT).show();
                 }
                 else {
                     textView.setText(s);
                 }
                }
            }
        });
    }
}