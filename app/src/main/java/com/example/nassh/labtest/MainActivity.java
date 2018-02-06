package com.example.nassh.labtest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b,c,d;
    TextView e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.green);
        c = findViewById(R.id.red);
        d = findViewById(R.id.blue);
        e = findViewById(R.id.ed);

        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText("Green");
                e.setTextColor(Color.GREEN);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
          @Override
        public void onClick(View view) {
            e.setText("RED");
            e.setTextColor(Color.RED);
        }
    });
         d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText("BLUE");
                e.setTextColor(Color.BLUE);
            }
        });

}

    @Override
    public void onClick(View view) {
    }
}
