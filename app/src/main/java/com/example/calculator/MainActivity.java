package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView Calculator=findViewById(R.id.Calculator);
        CardView UnitConverter=findViewById(R.id.UnitConverter);
        CardView NumberConversion=findViewById(R.id.NumberConversion);
        CardView LogicalOperation=findViewById(R.id.LogicalOperation);
        CardView PermutationAndCombination=findViewById(R.id.PermutationAndCombination);
        CardView News=findViewById(R.id.News);
//        Calculator
        Calculator.setOnClickListener(view -> {
            Intent intent=new Intent(view.getContext(),cal.class);
            startActivity(intent);
            Log.d("S","Calculator");
        });
//        UnitConverter
        UnitConverter.setOnClickListener(view -> {
            Intent intent=new Intent(view.getContext(),Unit.class);
            startActivity(intent);
            Log.d("S","UnitConverter");

        });
//        NumberConversion
        NumberConversion.setOnClickListener(view -> {
            Intent intent=new Intent(view.getContext(),Con.class);
            startActivity(intent);
            Log.d("S","NumberConversion");
        });
//        LogicalOperation
        LogicalOperation.setOnClickListener(view -> {
            Intent intent=new Intent(view.getContext(),Logic.class);
            startActivity(intent);
            Log.d("S","LogicalOperation");
        });
//        PermutationAndCombination
        PermutationAndCombination.setOnClickListener(view -> {
            Intent intent=new Intent(view.getContext(),PerCom.class);
            startActivity(intent);
            Log.d("S","PermutationAndCombination");
        });
        News.setOnClickListener(view -> {
            Intent intent=new Intent(view.getContext(),news1.class);
            startActivity(intent);
            Log.d("S","PermutationAndCombination");
        });


    }
}