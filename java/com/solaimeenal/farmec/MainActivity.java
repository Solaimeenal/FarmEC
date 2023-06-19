package com.swarnamythili.farmec;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {
    private Button ecommerce,farmguider,donation,farmer_help;
    private ProgressDialog loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ecommerce = (Button) findViewById(R.id.ecommerce);
        donation=(Button) findViewById(R.id.donation);

        farmguider=(Button) findViewById(R.id.farmguider);

        farmer_help=(Button) findViewById(R.id.farmerhelp);

        loadingBar = new ProgressDialog(this);
        Paper.init(this);

        ecommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ecommerce.class);
                startActivity(intent);
            }
        });
        donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Donation.class);
                startActivity(intent);
            }
        });
        farmguider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Chatbot.class);
                startActivity(intent);
            }
        });


        farmer_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
