package com.example.celebration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.airbnb.lottie.LottieAnimationView;

public class AboutUs extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    private ImageButton email;
    private ImageButton call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

//        lottieAnimationView.setAnimation(R.raw.help);
//        lottieAnimationView.playAnimation();
//        lottieAnimationView.loop(false);

        email = findViewById(R.id.email);
        call = findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:+917677816141"));
                startActivity(call);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:ashishpatel3009@gmail.com"));
                email.putExtra(Intent.EXTRA_SUBJECT, "How May I Help You?");
                email.putExtra(Intent.EXTRA_TEXT, "Enter your Body here");
                startActivity(email);
            }
        });



    }
}