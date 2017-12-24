package com.omrobbie.mynewapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by omrobbie on 25/12/2017.
 */

public class CreateLayoutActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        Button button = new Button(this);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        button.setText("Click Me!");
        relativeLayout.addView(button, buttonDetails);
        relativeLayout.setBackgroundColor(Color.BLUE);
        button.setBackgroundColor(Color.GREEN);

        setContentView(relativeLayout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CreateLayoutActivity.this, "You click me :)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
