package com.example.hospital_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hospital_management.R;

public class patient_menu extends AppCompatActivity {
    Button add , view , update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_menu);
    }

    public void addPatient(View v){
        Intent intent = new Intent(this, add_patient.class);
        startActivity(intent);
        }

    public void viewPatient(View v){
        Intent intent = new Intent(this, view_patient.class);
        startActivity(intent);
    }

    public void editPatient(View v){
        Intent intent = new Intent(this, edit_patient.class);
        startActivity(intent);
    }




}
