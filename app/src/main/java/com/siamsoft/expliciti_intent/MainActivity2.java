package com.siamsoft.expliciti_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button b11;
    EditText ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed2 = (EditText) findViewById(R.id.et1);
        b11 = findViewById(R.id.btn2);
        String abc = getIntent().getExtras().getString("m1");
        ed2.setText(abc);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity2.this, MainActivity.class);


                startActivity(ii);

            }
        });

    }
}

