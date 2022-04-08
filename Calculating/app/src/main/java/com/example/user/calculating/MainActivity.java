package com.example.user.calculating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Label1;
    private TextView Label2;
    private Button LBut;
    private Button SBut;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Label1 = (TextView)findViewById(R.id.label1);
        Label2 = (TextView)findViewById(R.id.label2);
        LBut = (Button)findViewById(R.id.linearcalc);
        SBut = (Button)findViewById(R.id.squarecalc);
        mButton = (Button)findViewById(R.id.SortingBtn);

        LBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity.this, LinearActivity.class);

                startActivity(x);
            }
        });

        SBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent(MainActivity.this, SquareActivity.class);

                startActivity(y);
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(MainActivity.this, SortArrayActivity.class);

                startActivity(z);
            }
        });
    }


}
