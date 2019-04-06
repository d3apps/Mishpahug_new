package com.dennisdavydov.mishpahug;



import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.dennisdavydov.mishpahug.fragments.FiltersFragment;
import com.dennisdavydov.mishpahug.fragments.RegFragment;
import com.dennisdavydov.mishpahug.singletons.SingletonFonts;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        RegFragment.OnFragmentInteractionListener, FiltersFragment.OnFragmentInteractionListener {

    Button nextBtn, loginRegBtn;
    TextView main_screen_header, main_screen_text, main_screen_text2;
    AppDatabase myAppDatabase;
    RegFragment regFragment;

    FragmentManager manager;
    FragmentTransaction transaction;
    ConstraintLayout innerConstraintMainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAppDatabase= Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"eventDB").build();

        nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);

        loginRegBtn = findViewById(R.id.loginRegBtn);
        loginRegBtn.setOnClickListener(this);

        main_screen_header = findViewById(R.id.main_screen_header);
        main_screen_header.setTypeface(SingletonFonts.getInstance(this).getFont5());

        main_screen_text = findViewById(R.id.main_screen_text);
        main_screen_text.setTypeface(SingletonFonts.getInstance(this).getFont4());

        main_screen_text2 = findViewById(R.id.main_screen_text2);
        main_screen_text2.setTypeface(SingletonFonts.getInstance(this).getFont4());

        innerConstraintMainActivity
                = findViewById(R.id.innerConstraintMainActivity);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextBtn:{
                Intent intent=new Intent(this,MainPage.class);
                intent.putExtra("frgToLoad",1);
                startActivity(intent);
                //finish();
            }
            break;
            case R.id.loginRegBtn:{
                //Toast.makeText(this,"Button pressed",Toast.LENGTH_LONG).show();
                //innerConstraintMainActivity.setVisibility(View.GONE);
                manager = getSupportFragmentManager();
                transaction = manager.beginTransaction();
                regFragment = new RegFragment();
                transaction.addToBackStack(null);
                transaction.add(R.id.frameForFragment,regFragment);
                transaction.commit();
            }
            break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
