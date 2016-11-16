package com.example.shun.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button bLogin;
    private EditText etUsername;
    private EditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bLogin = (Button)findViewById(R.id.bLogin);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etUsername = (EditText)findViewById(R.id.etUsername);

bLogin.setOnClickListener(this);
    }
public void onClick(View v){
    if (etUsername.getText().toString().equals("User")
            & etPassword.getText().toString().equals("1234")){
        Toast.makeText(this,"Welcome!", Toast.LENGTH_SHORT).show();
    }else {
        Toast.makeText(this,"Access Denied",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"", Toast.LENGTH_SHORT).show();
    }

    }
}
