package com.example.myplacement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class Select extends AppCompatActivity {

    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        sp=(Spinner)findViewById(R.id.selectuser);
    }


    public void OnProcessClicked(View view) {
        String user = sp.getSelectedItem().toString();
        if(user.equals("Student")){
        Intent process = new Intent(Select.this, StudentLogin.class);
        startActivity(process);
        }
        else if(user.equals("Company")){
            Intent intent = new Intent(Select.this,CompanyLogin.class);
            startActivity(intent);
        }
        else if(user.equals("Admin")){
            Intent intent = new Intent(Select.this,AdminLogin.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Please choose user type",Toast.LENGTH_SHORT).show();
        }
    }


}
