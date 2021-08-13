package com.example.svasth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.CollapsibleActionView;
import android.view.MenuItem;

import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseError;

public class UserDashboard extends AppCompatActivity {
    public ImageView bed;
    public ImageView hospital;
    public ImageView helpline;
    public ImageView care;
    public ImageView essentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        bed= (ImageView) findViewById(R.id.bed);
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(UserDashboard.this,Bed.class);
                startActivity(intent);
            }
        });

        hospital= (ImageView) findViewById(R.id.hospital);
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(UserDashboard.this,hospitals.class);
                startActivity(intent);
            }
        });

        helpline= (ImageView) findViewById(R.id.helpline);
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(UserDashboard.this,helpline.class);
                startActivity(intent);
            }
        });

        care= (ImageView) findViewById(R.id.careCenter);
        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(UserDashboard.this,care.class);
                startActivity(intent);
            }
        });

        essentials= (ImageView) findViewById(R.id.essentials);
        essentials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(UserDashboard.this,essentials.class);
                startActivity(intent);
            }
        });



    }
}