package com.example.user.calculating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class SortingActivity extends AppCompatActivity {

    private TextView textViewer;
    private Button btnback;
    public static int[] arr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

        textViewer = (TextView)findViewById(R.id.Array);
        btnback = (Button)findViewById(R.id.btnback);

        arr = getIntent().getIntArrayExtra("sort_extra");
        textViewer.setText(Arrays.toString(arr));

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arrays.sort(arr);

                Intent intent = new Intent();

                intent.putExtra("sort_extra", arr);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
