package com.example.calculator;

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
//        Calculator
        Calculator.setOnClickListener(view -> Log.d("S","Calculator"));
//        UnitConverter
        UnitConverter.setOnClickListener(view -> Log.d("S","UnitConverter"));
//        NumberConversion
        NumberConversion.setOnClickListener(view -> Log.d("S","NumberConversion"));
//        LogicalOperation
        LogicalOperation.setOnClickListener(view -> Log.d("S","LogicalOperation"));
//        PermutationAndCombination
        PermutationAndCombination.setOnClickListener(view -> Log.d("S","PermutationAndCombination"));


    }
}