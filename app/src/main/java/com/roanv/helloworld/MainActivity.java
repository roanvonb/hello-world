package com.roanv.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_hello = (Button) findViewById(R.id.btn_hello_id);
        final TextView lbl_hello = (TextView) findViewById(R.id.lbl_hello_id);

        btn_hello.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                lbl_hello.setVisibility(View.VISIBLE);
            }
        });

        //test comment
    }
}
