package edu.stanford.cs108.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getCost(View view){
        EditText weightText = (EditText) findViewById(R.id.weight);
        CheckBox insurance_checkbox = (CheckBox) findViewById(R.id.insurance_checkbox);
        TextView costView = (TextView) findViewById(R.id.cost);

        int weightDecimal = Integer.parseInt(weightText.getText().toString());
        Log.d(TAG, "onCreate() No saved state available");
        RadioGroup group = (RadioGroup) findViewById(R.id.deliver_group);
        int currentOption = group.getCheckedRadioButtonId();
        float cost = 0.0f;
        switch(currentOption) {
            case R.id.next_day_button:
                cost = 10*weightDecimal;
                break;
            case R.id.second_day_button:
                cost = 5*weightDecimal;
                break;
            case R.id.standard_button:
                cost = 3*weightDecimal;
                break;
        }
        if (insurance_checkbox.isChecked()){
            cost = cost * 1.2f;
        }
        int ceilingCost = (int) Math.ceil(cost);
        Log.d(TAG, Integer.toString(ceilingCost));

        costView.setText(Integer.toString(ceilingCost));

    }
}
