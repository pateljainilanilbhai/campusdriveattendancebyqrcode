package com.example.jainil.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teacheroptions extends AppCompatActivity {


    Button b1;
    Button b2;
    Button b3;
    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacheroptions);
        b1=(Button)findViewById(R.id.button5);
        b2=(Button)findViewById(R.id.button7);
        b3=(Button)findViewById(R.id.button8);
        b4=(Button)findViewById(R.id.button9);


        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(Teacheroptions.this,viewinguserenrol.class);
            i.putExtra("companyname",getIntent().getStringExtra("companyname").toString());
            startActivity(i);
        }
    });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Teacheroptions.this,viewround1resultlist.class);
                i.putExtra("companyname",getIntent().getStringExtra("companyname").toString());
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Teacheroptions.this,viewround2resultlist.class);
                i.putExtra("companyname",getIntent().getStringExtra("companyname").toString());
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Teacheroptions.this,viewround3resultlist.class);
                i.putExtra("companyname",getIntent().getStringExtra("companyname").toString());
                startActivity(i);
            }
        });
}
}


