package com.example.d.meterstoinches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;

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
    }


}
