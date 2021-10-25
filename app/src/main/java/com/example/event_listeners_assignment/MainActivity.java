package com.example.event_listeners_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_click;
    private TextView mTv_text;
    private EditText mEt_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn_click = findViewById(R.id.btn_click);
        mEt_box = findViewById(R.id.et_box);
        mTv_text = findViewById(R.id.tv_text);

        mBtn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv_text.setText("ButtonClicked");
            }
        });

        mEt_box.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() >= 6){
                    Toast.makeText(MainActivity.this,s.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}