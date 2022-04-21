package com.example.colordescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private TextView textViewColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        textViewColor = findViewById(R.id.textViewColor);
    }

    public void onClickColorDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String color = colorDescriptionByPosition(position);
        textViewColor.setText(color);

    }

    private String colorDescriptionByPosition(int position){
        String[] colors = getResources().getStringArray(R.array.color_descriptions);
        return colors[position];
    }
}