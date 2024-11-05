package com.example.baiktra15p;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button calculate;
Button reset;
TextView result;
CheckBox checkBox;
EditText height;
EditText weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        calculate = findViewById(R.id.btn_calculate);
        reset = findViewById(R.id.btn_reset);
        checkBox = findViewById(R.id.checkBox);
        result = findViewById(R.id.txt_result);
        height = findViewById(R.id.txt_height);
        weight = findViewById(R.id.txt_weight);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double chieucao = Double.parseDouble(height.getText().toString());
                    double cannang = Double.parseDouble(weight.getText().toString());
                    double ketqua = cannang / (chieucao * chieucao);

                    result.setText(String.format("BMI: %.2f", ketqua));
                } catch (NumberFormatException e) {
                    result.setText("Vui long nhap dung can nang va abcbs");

                    result.setText("Vui long nhap dung can nang va abcbs");
                    result.setText("Vui long nhap dung can nang va abcbs");

                }
            }
        });
    }
}