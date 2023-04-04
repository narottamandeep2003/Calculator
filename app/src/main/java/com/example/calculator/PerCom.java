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

class Solution{
    int combination(int n,int r){
        if (r > n)
            return 0;
        if (r == 0 || r == n)
            return 1;
        return  combination(n-1,r-1)+combination(n-1,r);
    }
    int Permutation(int n, int k)
    {
        int P = 1;


        for (int i = 0; i < k; i++)
            P *= (n-i) ;

        return P;
    }

}
public class PerCom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_com);
        TextView textView=findViewById(R.id.text2);
        EditText editText1=findViewById(R.id.editText1);
        EditText editText2=findViewById(R.id.editText2);

        Button btn= findViewById(R.id.button2);
        btn.setOnClickListener(view -> {

            int n=Integer.parseInt(String.valueOf(editText1.getText()));
            int r=Integer.parseInt(String.valueOf(editText2.getText()));
            RadioGroup radioGroup=findViewById(R.id.radioGroup);
            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton radioButton =  findViewById(selectedId);
            if(selectedId==-1){
                Toast.makeText(this, ""+(n+r), Toast.LENGTH_SHORT).show();
            }
            else{
                if(radioButton.getText().equals("Combination")){
                    Solution s=new Solution();
                    textView.setText(String.valueOf(s.combination(n,r)));
                    Toast.makeText(this,textView.getText(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Solution s=new Solution();
                    textView.setText(String.valueOf(s.Permutation(n,r)));
                    Toast.makeText(this,textView.getText(), Toast.LENGTH_SHORT).show();
                }

            }

            textView.setVisibility(View.VISIBLE);
        });
    }
}