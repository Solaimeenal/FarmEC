package com.swarnamythili.farmec;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DonarPage extends AppCompatActivity {

    // creating variables for
    // EditText and buttons.
    private EditText donarNameEdt, donarMobilenoEdt, donarAddressEdt,donationAmountEdt;
    private Button submitDonation;

    // creating a variable for our
    // Firebase Database.
    FirebaseDatabase firebaseDatabase;

    // creating a variable for our Database
    // Reference for Firebase.
    DatabaseReference databaseReference;

    // creating a variable for
    // our object class
    DonarInfo DonarInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donar_page);

        // initializing our edittext and button
        donarNameEdt = findViewById(R.id.donarname);
        donarMobilenoEdt = findViewById(R.id.donarmobileno);
        donarAddressEdt = findViewById(R.id.donaraddress);
        donationAmountEdt=findViewById(R.id.donation_Amount);

        // below line is used to get the
        // instance of our FIrebase database.
        firebaseDatabase = FirebaseDatabase.getInstance();

        // below line is used to get reference for our database.
        databaseReference = firebaseDatabase.getReference("Donation");

        // initializing our object
        // class variable.
        DonarInfo = new DonarInfo();

        submitDonation = findViewById(R.id.submit_donation);

        // adding on click listener for our button.
        submitDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // getting text from our edittext fields.
                String name = donarNameEdt.getText().toString();
                String phone = donarMobilenoEdt.getText().toString();
                String address =donarAddressEdt.getText().toString();
                String amount=donationAmountEdt.getText().toString();

                // below line is for checking weather the
                // edittext fields are empty or not.
                if (TextUtils.isEmpty(name) && TextUtils.isEmpty(phone) && TextUtils.isEmpty(address)&&TextUtils.isEmpty(amount)) {
                    // if the text fields are empty
                    // then show the below message.
                    Toast.makeText(DonarPage.this, "Please add some data.", Toast.LENGTH_SHORT).show();
                } else {
                    // else call the method to add
                    // data to our database.
                    addDatatoFirebase(name, phone, address,amount);
                }
            }
        });
    }

    private void addDatatoFirebase(String name, String phone, String address,String amount) {
        // below 3 lines of code is used to set
        // data in our object class.
        DonarInfo.setdonarName(name);
        DonarInfo.setdonarMobileno(phone);
        DonarInfo.setdonarAddress(address);
        DonarInfo.setdonationAmount(amount);

        // we are use add value event listener method
        // which is called with database reference.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // inside the method of on Data change we are setting
                // our object class to our database reference.
                // data base reference will sends data to firebase.
                databaseReference.setValue(DonarInfo);

                // after adding this data we are showing toast message.
                Toast.makeText(DonarPage.this, "data added", Toast.LENGTH_SHORT).show();
                Intent mainIntent=new Intent(DonarPage.this, PaymentPage.class);
                mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(mainIntent);
                finish();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // if the data is not added or it is cancelled then
                // we are displaying a failure toast message.
                Toast.makeText(DonarPage.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
