package com.example.user.calculating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearActivity extends AppCompatActivity {

    private EditText A;
    private EditText B;
    private EditText C;

    private TextView result;

    private Button BtnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Initialization();
    }

    private void Initialization() {
        A = (EditText)findViewById(R.id.Aedit);
        B = (EditText)findViewById(R.id.Bedit);
        C = (EditText)findViewById(R.id.Cedit);

        result = (TextView)findViewById(R.id.resultat);

        Checker();

    }

    private void Checker() {
        BtnCalc = (Button)findViewById(R.id.calcbtn);

        BtnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double a=0, b=0, c=0;

                if(A.getText().length() != 0)
                    a = Double.parseDouble(A.getText().toString());
                else {
                    return;
                }

                if(B.getText().length() != 0)
                    b = Double.parseDouble(B.getText().toString());
                else {
                    return;
                }

                if(C.getText().length() != 0)
                    c = Double.parseDouble(C.getText().toString());
                else {
                    return;
                }

                result.setText(String.valueOf(CalcResult(a,b,c)));
            }
        });
    }

    private double CalcResult(double a, double b, double c) {
        return (c-b)/a;
    }
}
