package edu.stanford.cs108.colorpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getColor(View view){
        SeekBar redSeekBar = findViewById(R.id.redSeekBar);
        SeekBar greenSeekBar = findViewById(R.id.greenSeekBar);
        SeekBar blueSeekerBar = findViewById(R.id.blueSeekBar);
        View colorView = findViewById(R.id.colorView);
        TextView textView = findViewById(R.id.textView);

        int red = redSeekBar.getProgress();
        int green = greenSeekBar.getProgress();
        int blue = blueSeekerBar.getProgress();
        colorView.setBackgroundColor(Color.rgb(red,green,blue));
        textView.setText("Red: "+Integer.toString(red)+", Green: "+Integer.toString(green)+", Blue: "+Integer.toString(blue));

    }
}
