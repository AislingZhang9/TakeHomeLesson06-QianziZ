package com.example.inclassassignment06qianziz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    double amount = 0.0;
    double taxPercentage = 0.0;
    double tipPercentage = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Tip Calculator");
    }

    public double getAmount() {
        EditText amountField = (EditText) findViewById(R.id.amount_field);
        String number = amountField.getText().toString();
        amount = Double.parseDouble(number);
        return amount;
    }

    public double getTaxPercentage() {
        EditText taxField = (EditText) findViewById(R.id.tax_field);
        String number = taxField.getText().toString();
        taxPercentage = Double.parseDouble(number);
        return taxPercentage;
    }

    public double getTipPercentage() {
        EditText tipField = (EditText) findViewById(R.id.tip_field);
        String number = tipField.getText().toString();
        tipPercentage = Double.parseDouble(number);
        return tipPercentage;
    }

    public void submit(View view) {
        amount = getAmount();
        taxPercentage = getTaxPercentage();
        tipPercentage = getTipPercentage();
        Intent launchActivityIntent = new Intent(this, SecondActivity.class);
        launchActivityIntent.putExtra("AMOUNT_DOUBLE", amount);
        launchActivityIntent.putExtra("TAX_DOUBLE", taxPercentage);
        launchActivityIntent.putExtra("TIP_DOUBLE", tipPercentage);
        startActivity(launchActivityIntent);
    }

}
