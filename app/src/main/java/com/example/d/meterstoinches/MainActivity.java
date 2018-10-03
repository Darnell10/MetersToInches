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

    @BindView(R.id.convert_button)
    Button convertButton;

    @BindView(R.id.result_text)
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //conversion logic

                double muliply = 39.37;
                double result = 0.0;

                if (metersEntery.getText().toString().equals("")) {
                    //sets error message if no value is entered
                    resultText.setText(R.string.error_message);
                    //sets color of error message
                    resultText.setTextColor(Color.RED);
                } else {
                    //converts numbers entered to doubles
                    double meterValue = Double.parseDouble(metersEntery.getText().toString());
                    result = meterValue * muliply;

                    //converts to string
                    //resultText.setText(Double.toString(result) + " inches ");
                    resultText.setTextColor(Color.DKGRAY);
                    resultText.setText(String.format("%.2f", result));

                }
            }
        });
    }


}
