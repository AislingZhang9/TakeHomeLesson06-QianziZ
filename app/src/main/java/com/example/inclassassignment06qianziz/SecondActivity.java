package com.example.inclassassignment06qianziz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        this.setTitle("Your Receipt");

        Intent calculationActivityIntent = getIntent();
        Double amount = calculationActivityIntent.getDoubleExtra("AMOUNT_DOUBLE", 0.0);
        Double taxPercentage = calculationActivityIntent.getDoubleExtra("TAX_DOUBLE", 0.0);
        Double tipPercentage = calculationActivityIntent.getDoubleExtra("TIP_DOUBLE", 0.0);

        Double tax = amount * taxPercentage;
        Double tip = amount * tipPercentage;
        Double total = amount + tax + tip;

        String amountString = String.valueOf(amount);
        String taxString = String.valueOf(tax);
        String tipString = String.valueOf(tip);
        String totalString = String.valueOf(total);

        String display = "Total: " + amountString + "\nSales Tax: " + taxString + "\nTip: " + tipString + "\nGrand Total: " + totalString;

        TextView displayTextView = (TextView) findViewById(R.id.receipt_text_view);
        displayTextView.setText(display);
    }

}
