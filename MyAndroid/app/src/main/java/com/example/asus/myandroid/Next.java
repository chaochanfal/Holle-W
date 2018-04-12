package com.example.asus.myandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by asus on 2018/3/31.
 */

public class Next extends Activity {
    private Button backbutton;
    private Button textbutton;
    private TextView textview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);
        backbutton=findViewById(R.id.BackButton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        textview=findViewById(R.id.textView);
        textbutton=findViewById(R.id.TextButton);
        textbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            textview.setText(getIntent().getStringExtra("txt"));
            }
        });
    }
}
