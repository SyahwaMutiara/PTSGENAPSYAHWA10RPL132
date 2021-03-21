package com.example.PTSGENAP10RPL132;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, PasswordEditText;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.activity_main_usernameEditText);
        PasswordEditText = findViewById(R.id.activity_main_passwordEditText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = usernameEditText.getText().toString();
                String Password = PasswordEditText.getText().toString();

                if (Email.equalsIgnoreCase("admin@gmail.com") && Password.equalsIgnoreCase("12345")){
                    Toast.makeText(MainActivity.this, "Succesful Login", Toast.LENGTH_SHORT).show();
                    Intent Intent = new Intent(MainActivity.this, MainPage.class);
                    startActivity(Intent);

                } else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}