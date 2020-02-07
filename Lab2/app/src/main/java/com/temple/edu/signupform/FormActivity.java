package com.temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputEmail;
    EditText inputPassword;
    EditText inputCheck;

    String name, email, password, check;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = (EditText) findViewById(R.id.Name);
        inputEmail = (EditText) findViewById(R.id.Email);
        inputPassword = (EditText) findViewById(R.id.Password);
        inputCheck = (EditText) findViewById(R.id.Check);

        save = (Button) findViewById(R.id.button);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                name = inputName.getText().toString();
                email = inputEmail.getText().toString();
                password = inputPassword.getText().toString();
                check = inputCheck.getText().toString();

                if(name.isEmpty() || email.isEmpty() || password.isEmpty() || check.isEmpty()){
                    showToast("Please enter info for the blank filed");
                }else if(password.equals(check) == false || password.isEmpty()){
                    showToast("Password does not match");
                }else{
                    showToast("Welcome " + name + " to signup form app");
                }
            }
        });

    }
        private void showToast(String text){
            Toast.makeText(FormActivity.this, text, Toast.LENGTH_LONG).show();
        }



}
