package edu.stanford.cs108.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getCost(View view){
        RadioButton isNextDay = (RadioButton) findViewById(R.id.next_day_button);
        RadioButton isSecondDay = (RadioButton) findViewById(R.id.second_day_button);
        RadioButton isStandard = (RadioButton) findViewById(R.id.standard_button);
        EditText weight = (EditText) findViewById(R.id.weight);
        CheckBox insurance_checkbox = (CheckBox) findViewById(R.id.insurance_checkbox);
        TextView cost = (TextView) findViewById(R.id.cost);

    }
}
