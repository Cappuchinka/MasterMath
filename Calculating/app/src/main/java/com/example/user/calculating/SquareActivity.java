package com.example.user.calculating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SquareActivity extends AppCompatActivity {
    private EditText A;
    private EditText B;
    private EditText C;

    private TextView result;

    private Button BtnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

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

                double a = 0, b = 0, c = 0;

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

                result.setText(String.valueOf("X1: "+ X1(a,b,c) + '\n' + "X2: "+X2(a,b,c)));
            }
        });
    }

    private double X1(double a, double b, double c) {
        double D = D(a,b,c);

        if (D < 0)
        {
            return Math.sqrt(D);
        }
        else if(D == 0)
        {
            return -b/(2*a);
        }
        else
        {
            return (-b - Math.sqrt(D))/(2*a);
        }
    }

    private double X2(double a, double b, double c) {
        double D = D(a,b,c);

        if (D < 0)
        {
            return Math.sqrt(D);
        }
        else if(D == 0)
        {
            return -b/(2*a);
        }
        else
        {
            return (-b + Math.sqrt(D))/(2*a);
        }
    }

    private double D(double a, double b, double c) {
        return b*b-4*a*c;
    }
}
