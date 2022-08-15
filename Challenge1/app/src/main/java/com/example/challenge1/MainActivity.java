package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.displayFirstName);
        TextView txtLastName = findViewById(R.id.displayLastName);
        TextView txtEmail = findViewById(R.id.displayEmail);
        EditText edtFirstName = findViewById(R.id.editFirstName);
        EditText edtLastName = findViewById(R.id.editLastName);
        EditText edtEmail = findViewById(R.id.editEmail);
        txtFirstName.setText("First Name: " + edtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtLastName.getText().toString());
        txtEmail.setText("Email: " + edtEmail.getText().toString());

    }
}