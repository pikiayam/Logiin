package com.vickyhadisaputra202102353.logiin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    public static final String CALL_ID = "call_id";
    private Button _tampilMahasiswaButton, _tampilForexButton, _tampilCuacaButton, _tampilIntentImButton, _tampilTabButton;
    private Intent _tampilMahasiswaIntent, _tampilForexIntent, _tampilCuacaIntent, _tampilIntentImIntent, _tampilTabIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String name = getIntent().getStringExtra(CALL_ID);
        setTitle("Hallo  "+ name);

        initTampilMahasiswaButton();
        initTampilForexButton();
        initTampilCuacaButton();
        initTampilIntentImButton();
        initTampilTabButton();
    }

    private void initTampilMahasiswaButton() {
        _tampilMahasiswaButton = (Button) findViewById(R.id.tampilMahasiswaButton);

        _tampilMahasiswaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilMahasiswaIntent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                startActivity(_tampilMahasiswaIntent);
            }
        });
    }

    private void initTampilForexButton() {
        _tampilForexButton = (Button) findViewById(R.id.tampilForexButton);

        _tampilForexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_tampilForexIntent);
            }
        });

    }

    private void initTampilCuacaButton() {
        _tampilCuacaButton = (Button) findViewById(R.id.tampilCuacaButton);

        _tampilCuacaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilCuacaIntent = new Intent(getApplicationContext(), CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);
            }
        });
    }
    private void initTampilIntentImButton() {
        _tampilIntentImButton = (Button) findViewById(R.id.tampilIntentImButton);

        _tampilIntentImButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilIntentImIntent = new Intent(getApplicationContext(), IntentMainActivity.class);
                startActivity(_tampilIntentImIntent);
            }
        });
    }
    private void initTampilTabButton() {
        _tampilTabButton = (Button) findViewById(R.id.tampilTabButton);

        _tampilTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilTabIntent = new Intent(getApplicationContext(), TabMainActivity.class);
                startActivity(_tampilTabIntent);
            }
        });
    }
}