package com.example.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText edtPrimeiroNome;
    Button btnApresentar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrimeiroNome = findViewById(R.id.edtPrimeiroNome);
        btnApresentar = findViewById(R.id.btnAprsentar);
        tvResult = findViewById(R.id.tvResult);

        btnApresentar.setOnClickListener(new View.OnClickListener()) {
            @Override
                    public void onClick(View v) {
                tvResult.setText(edtPrimeiroNome.getText());
            }
        }
    }
}