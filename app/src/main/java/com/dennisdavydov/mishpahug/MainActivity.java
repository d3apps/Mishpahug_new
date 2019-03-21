package com.dennisdavydov.mishpahug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button nextBtn;
    TextView main_screen_header, main_screen_text, main_screen_text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);

        main_screen_header = findViewById(R.id.main_screen_header);
        main_screen_header.setTypeface(SingletonFonts.getInstance(this).getFont5());

        main_screen_text = findViewById(R.id.main_screen_text);
        main_screen_text.setTypeface(SingletonFonts.getInstance(this).getFont4());

        main_screen_text2 = findViewById(R.id.main_screen_text2);
        main_screen_text2.setTypeface(SingletonFonts.getInstance(this).getFont4());



    }


    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,MainPage.class);
        startActivity(intent);
        finish();
    }
}
