package com.example.addressapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddressFormActivity extends AppCompatActivity {
    private EditText villageInput, postInput, streetInput, districtInput, pinInput, stateInput, countryInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_form);

        villageInput = findViewById(R.id.villageInput);
        postInput = findViewById(R.id.postInput);
        streetInput = findViewById(R.id.streetInput);
        districtInput = findViewById(R.id.districtInput);
        pinInput = findViewById(R.id.pinInput);
        stateInput = findViewById(R.id.stateInput);
        countryInput = findViewById(R.id.countryInput);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> submitAddress());
    }

    private void submitAddress() {
        Intent intent = new Intent(AddressFormActivity.this, AddressDetailsActivity.class);
        intent.putExtra("village", villageInput.getText().toString());
        intent.putExtra("post", postInput.getText().toString());
        intent.putExtra("street", streetInput.getText().toString());
        intent.putExtra("district", districtInput.getText().toString());
        intent.putExtra("pin", pinInput.getText().toString());
        intent.putExtra("state", stateInput.getText().toString());
        intent.putExtra("country", countryInput.getText().toString());
        startActivity(intent);
    }
}