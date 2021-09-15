package com.example.voterapp3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button registration;
    RelativeLayout mainactivitylayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.login);
        registration = (Button)findViewById(R.id.regi);


    }

    public void reg(View v){
          FragmentManager fm = getSupportFragmentManager();
          FragmentTransaction ft = fm.beginTransaction();
          ft.add(R.id.mainactivitylayout,new frag1());
          ft.addToBackStack(null);
          ft.commit();
    }
}
