package com.dennisdavydov.mishpahug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button nextBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,MainPage.class);
        startActivity(intent);
        finish();
    }
}
