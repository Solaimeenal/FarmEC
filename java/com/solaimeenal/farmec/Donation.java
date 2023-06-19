package com.swarnamythili.farmec;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.paperdb.Paper;

public class Donation extends AppCompatActivity {
    private Button donar, farmer;
    private ProgressDialog loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);
        donar = (Button) findViewById(R.id.donar);
        farmer = (Button) findViewById(R.id.farmer);
        loadingBar = new ProgressDialog(this);
        Paper.init(this);

        donar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Donation.this, DonarPage.class);
                startActivity(intent);
            }
        });
        farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Donation.this, DonationNeederPage.class);
                startActivity(intent);
            }
        });
    }
}
