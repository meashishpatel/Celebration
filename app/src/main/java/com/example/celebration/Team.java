package com.example.celebration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Team extends AppCompatActivity {

    private ImageButton ashish_email, anjali_email, sarika_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        ashish_email = findViewById(R.id.ashish_email);
        ashish_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:ashishpatel3009@gmail.com"));
                email.putExtra(Intent.EXTRA_SUBJECT, "How May I help you?");
                email.putExtra(Intent.EXTRA_TEXT, "Enter your Body here");
                startActivity(email);
            }
        });
        anjali_email = findViewById(R.id.anjali_email);
        anjali_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:ashishpatel3009@gmail.com"));
                email.putExtra(Intent.EXTRA_SUBJECT, "How May I help you?");
                email.putExtra(Intent.EXTRA_TEXT, "Enter your Body here");
                startActivity(email);
            }
        });
        sarika_email = findViewById(R.id.sarika_email);
        sarika_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:ashishpatel3009@gmail.com"));
                email.putExtra(Intent.EXTRA_SUBJECT, "How May I help you?");
                email.putExtra(Intent.EXTRA_TEXT, "Enter your Body here");
                startActivity(email);
            }
        });
    }
}