package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class CicloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo);
    }
        @Override
        protected void onStart(){
            super.onStart();
            Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onResume(){
            super.onResume();
            Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPause(){
            super.onPause();
            Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop(){
            super.onStop();
            Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        }
}