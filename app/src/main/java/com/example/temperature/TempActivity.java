package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
    }

    public void buttonClicked(View v)
    {
        EditText temperatureView = (EditText) findViewById(R.id.temperatureBox);
        String temperature = temperatureView.getText().toString();

        TemperatureModel myModel = new TemperatureModel(temperature);
        String toCelsius = myModel.convertToC();

        ((TextView) findViewById(R.id.temperatureBox)).setText(toCelsius);
    }

    public void button2Clicked(View v)
    {
        EditText temperatureView = (EditText) findViewById(R.id.temperatureBox);
        String temperature = temperatureView.getText().toString();

        TemperatureModel myModel = new TemperatureModel(temperature);
        String toFarenheit = myModel.convertToF();

        ((TextView) findViewById(R.id.temperatureBox)).setText(toFarenheit);
    }

    public void button3Clicked(View v)
    {
        EditText temperatureView = (EditText) findViewById(R.id.temperatureBox);
        String temperature = temperatureView.getText().toString();

        TemperatureModel myModel = new TemperatureModel(temperature);
        String clearinput = myModel.clear();

        ((TextView) findViewById(R.id.temperatureBox)).setText(clearinput);
    }
}
