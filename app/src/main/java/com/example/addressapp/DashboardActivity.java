package com.example.addressapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button addressButton = findViewById(R.id.addressButton);
        addressButton.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, AddressFormActivity.class);
            startActivity(intent);
        });
    }
}