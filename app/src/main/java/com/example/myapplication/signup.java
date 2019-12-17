package com.example.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    EditText email,name,phone,pass,cofirmpass;
    TextView login;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        email=findViewById(R.id.emailedit);
        email.setText((CharSequence) getIntent().getExtras().get("email"));

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");

        email.setTypeface(custom_font);

        //email.getText()=;


    }
}
