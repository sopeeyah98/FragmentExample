package com.example.fragmentexample;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button button_fragmentOne, button_fragmentTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_fragmentOne = findViewById(R.id.button_one);
        button_fragmentTwo = findViewById(R.id.button_two);

        button_fragmentOne.setOnClickListener( v -> loadFragment(new FragmentFirst()));
        button_fragmentTwo.setOnClickListener( v -> loadFragment(new FragmentSecond()));
    }

    // based on navigation component, decide which fragment to load into place holder
    public void loadFragment(Fragment fragment){
        // fragment manager
        // API 28 - changed accessbility of the manager
        // before API 28, getFragmentManager()
        // after API 28, getSupportFragmentManager()

        // create fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // create fragment transaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // replace fragment place holder - we have fragmentContainerView w/ fragment that is passed as a parameter
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment);
        fragmentTransaction.commit();
    }
}