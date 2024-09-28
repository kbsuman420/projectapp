package com.example.addressapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AddressDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_details);

        TextView addressDetailsView = findViewById(R.id.addressDetailsView);
        String village = getIntent().getStringExtra("village");
        String post = getIntent().getStringExtra("post");
        String street = getIntent().getStringExtra("street");
        String district = getIntent().getStringExtra("district");
        String pin = getIntent().getStringExtra("pin");
        String state = getIntent().getStringExtra("state");
        String country = getIntent().getStringExtra("country");

        String addressDetails = "Village: " + village + "\n" +
                "Post: " + post + "\n" +
                "Street: " + street + "\n" +
                "District: " + district + "\n" +
                "PIN: " + pin + "\n" +
                "State: " + state + "\n" +
                "Country: " + country;

        addressDetailsView.setText(addressDetails);
    }
}