package com.example.user.calculating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SortArrayActivity extends AppCompatActivity {

    private Button mButton;
    private EditText mEditText;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_array);

        mButton = (Button)findViewById(R.id.btnsort);
        mEditText = (EditText)findViewById(R.id.EnterArray);
        mTextView = (TextView)findViewById(R.id.ResultArray);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = mEditText.getText().toString();
                String[] array = string.split(" ");
                int[] mass = new int[array.length];

                for(int i = 0; i < array.length; i++) {
                    mass[i] = Integer.parseInt(array[i]);
                }

                Intent i = new Intent(SortArrayActivity.this, SortingActivity.class);

                i.putExtra("sort_extra", mass);

                startActivityForResult(i, 1);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_OK) {
            int[] result = data.getIntArrayExtra("sort_extra");
            for (int cResult : result)
                mTextView.setText(mTextView.getText().toString() + " " + cResult);
        }
    }
}
