package com.example.android_ready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.android_ready.databinding.ActivityMainBinding;

public class MainActivity extends BaseAppActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupButtons();

    }

    private void setupButtons() {
        binding.buttonStartDemoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                startActivity(intent);
            }
        });

        binding.buttonStartDemoActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DemoActivity2.class);
                startActivity(intent);
            }
        });
    }
}