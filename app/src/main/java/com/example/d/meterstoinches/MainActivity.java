package com.example.d.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // 1 m == 39.3701 in

    @BindView(R.id.meters_inches)
    ImageView metersToInches;

    @BindView(R.id.meters_entry)
    EditText metersEntery;

    @BindView(R.id.convert_button_toInches)
    Button convertButton1;

    @BindView(R.id.convert_button_toMeters)
    Button convertButton2;

    @BindView(R.id.result_text)
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        convertButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //conversion logic
                double multiply = 39.37;
                double result = 0.0;

                if (metersEntery.getText().toString().equals("")) {
                    //sets error message if no value is entered
                    resultText.setText(R.string.error_message);
                    //sets color of error message
                    resultText.setTextColor(Color.RED);
                } else {
                    //converts numbers entered to doubles
                    double meterValue = Double.parseDouble(metersEntery.getText().toString());
                    result = meterValue * multiply;

                    //converts to string
                    //resultText.setText(Double.toString(result) + " inches ");
                    resultText.setTextColor(Color.DKGRAY);
                    resultText.setText(String.format("%.2f", result));

                }
            }
        });

        convertButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //conversion logic
                double divide = 39.37;
                double result2 = 0.0;

                if (metersEntery.getText().toString().equals("")) {
                    //set error message if no value is entered
                    resultText.setText(R.string.error_message);
                    //sets color or error message
                    resultText.setTextColor(Color.RED);
                } else {
                    //converts numbers entered to doubles
                    double inchesValue = Double.parseDouble(metersEntery.getText().toString());
                    result2 = inchesValue / divide;

                    //converts to Sting
                    resultText.setTextColor(Color.DKGRAY);
                    resultText.setText(String.format("%.2f",result2));


                }
            }
        });
    }


}
