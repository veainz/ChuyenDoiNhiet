package com.example.chuyendoinhiet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends Activity {
    EditText txtCel, txtFar;
    Button btnCel, btnFar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCel = findViewById(R.id.txtCel);
        txtFar = findViewById(R.id.txtFar);
        btnCel = findViewById(R.id.btnCel);
        btnFar = findViewById(R.id.btnFar);
        btnCel.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doC = txtCel.getText() + "";
//
                int C = Integer.parseInt(doC);
                txtFar.setText("" + dcf.format(C * 1.8 + 32));
            }
        });
        btnFar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
// TODO Auto-generated method stub
                String doF = txtFar.getText() + "";
                int F = Integer.parseInt(doF);
                txtCel.setText("" + dcf.format((F - 32) / 1.8));
            }
        });
    }
}