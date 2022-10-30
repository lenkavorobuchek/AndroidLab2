package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO)
            Toast.makeText(this, getResources().getString(R.string.keyboard_vis), Toast.LENGTH_SHORT).show();
        else if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_YES)
            Toast.makeText(this, getResources().getString(R.string.keyboard_hid), Toast.LENGTH_SHORT).show();

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.landscape), Toast.LENGTH_SHORT).show();
        else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.portrait), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}